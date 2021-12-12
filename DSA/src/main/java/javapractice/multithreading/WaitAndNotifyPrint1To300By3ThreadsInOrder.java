package javapractice.multithreading;

import java.util.concurrent.atomic.AtomicBoolean;

public class WaitAndNotifyPrint1To300By3ThreadsInOrder {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        AtomicBoolean status1 = new AtomicBoolean(false);
        AtomicBoolean status2 = new AtomicBoolean(false);
        Thread t1 = new Thread(new Print1To100(lock1, status1), "Thread-1-100");
        Thread t2 = new Thread(new Print101To200(lock1, lock2, status1, status2), "Thread-101-200");
        Thread t3 = new Thread(new Print201To300(lock2, status2), "Thread-201-300");

        t2.start();
        t3.start();
        t1.start();




    }


    static class Print1To100 implements Runnable {
        private Object lock1;
        private AtomicBoolean status1;

        public Print1To100(Object lock1, AtomicBoolean status1) {
            this.lock1 = lock1;
            this.status1 = status1;
        }

        @Override
        public void run() {


            synchronized (lock1) {
                System.out.println("Printing 1 to 100 by thread::" + Thread.currentThread().getName());
                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                status1.set(true);
                //Note , calling wait on monitor object not on this
                lock1.notify();
            }
        }
    }

    static class Print101To200 implements Runnable {
        private Object lock1;
        private Object lock2;
        private AtomicBoolean status1;
        private AtomicBoolean status2;

        public Print101To200(Object lock1, Object lock2, AtomicBoolean status1, AtomicBoolean status2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
            this.status1 = status1;
            this.status2 = status2;
        }

        @Override
        public void run() {
            synchronized (lock1) {
                while (!status1.get()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Waiting for other thread to print 1 to 100");
                       //Note , calling wait on monitor object not on this
                        lock1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Printing 101 to 200 by thread::" + Thread.currentThread().getName());
                for (int i = 101; i <= 200; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            synchronized (lock2) {
                status2.set(true);
                //Note , calling wait on monitor object not on this
                lock2.notify();
            }

        }
    }


    static class Print201To300 implements Runnable {
        private Object lock2;
        private AtomicBoolean status2;

        public Print201To300(Object lock2, AtomicBoolean status2) {
            this.lock2 = lock2;
            this.status2 = status2;
        }

        @Override
        public void run() {
            synchronized (lock2) {
                while (!status2.get()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Waiting for other thread to print 101 to 200");
                        //Note , calling wait on monitor object not on this
                        lock2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Printing 201 to 300 by thread::" + Thread.currentThread().getName());
                for (int i = 201; i <= 300; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }
    }
}