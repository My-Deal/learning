package javapractice.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AlternateJavaWithWaitNotify {



    public static void main(String[] args) {
       String java = "MyNameIsVirendra";
       AtomicInteger counter = new AtomicInteger(0);
       Object lock=new Object();
        Runnable runnable1 =new EvenRunnable(java,counter,lock);
        Runnable runnable2 = new OddRunnable(java,counter,lock);
        new Thread(runnable1).start();
        new Thread(runnable2).start();

    }

    static class EvenRunnable implements Runnable {
        private String java;
        private AtomicInteger counter;
        private Object lock;

        public EvenRunnable(String java, AtomicInteger counter,Object lock) {
            this.java = java;
            this.counter = counter;
            this.lock=lock;
        }

        public String getJava() {
            return java;
        }

        public void setJava(String java) {
            this.java = java;
        }

        public AtomicInteger getCounter() {
            return counter;
        }

        public void setCounter(AtomicInteger counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while(counter.get()<java.length()) {
                System.out.println("In thread:" + Thread.currentThread().getName());
                synchronized (this.lock) {
                    while ((counter.get() % 2) != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("Printing by thread:" + Thread.currentThread().getName() + ":" + java.charAt(counter.getAndIncrement()));
                    lock.notify();
                }
            }
        }
    }
    static class OddRunnable implements Runnable {
        private String java;
        private AtomicInteger counter;
        private Object lock;

        public OddRunnable(String java, AtomicInteger counter,Object lock) {
            this.java = java;
            this.counter = counter;
            this.lock=lock;
        }

        public String getJava() {
            return java;
        }

        public void setJava(String java) {
            this.java = java;
        }

        public AtomicInteger getCounter() {
            return counter;
        }

        public void setCounter(AtomicInteger counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while (counter.get() < java.length()) {
                System.out.println("In thread:" + Thread.currentThread().getName());
                synchronized (this.lock) {
                    while ((counter.get() % 2) == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("Printing by thread:" + Thread.currentThread().getName() + ":" + java.charAt(counter.getAndIncrement()));
                    lock.notify();
                }
            }
        }
    }

}
