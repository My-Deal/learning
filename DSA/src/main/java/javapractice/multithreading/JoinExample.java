package javapractice.multithreading;

public class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Print1to100(), "Thread::" + Print1to100.class.getName());
        Thread t2 = new Thread(new Print101to200(t1), "Thread::" + Print101to200.class.getName());
        Thread t3 = new Thread(new Print201to300(t2), "Thread::" + Print201to300.class.getName());
        System.out.println("Going to start all the thread from main");
        t1.start();
        t2.start();
        t3.start();
    }


    static class Print1to100 implements Runnable {


        @Override
        public void run() {
            System.out.println("Printing 1 to 100 in thread ::" + Thread.currentThread().getName());
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    static class Print101to200 implements Runnable {

        private Thread thread1To100;

        public Print101to200(Thread t1) {
            this.thread1To100 = t1;
        }

        @Override
        public void run() {
            try {
                thread1To100.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing 101 to 200 in thread ::" + Thread.currentThread().getName());
            for (int i = 101; i <= 200; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    static class Print201to300 implements Runnable {

        private Thread thread101To200;

        public Print201to300(Thread thread101To200) {
            this.thread101To200 = thread101To200;
        }

        @Override
        public void run() {

            try {
                thread101To200.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing 201 to 300 in thread ::" + Thread.currentThread().getName());
            for (int i = 201; i <= 300; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


}