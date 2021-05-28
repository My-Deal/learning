package javapractice.multithreading;

public class Deadlock {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        Runnable r1 = () -> {
            deadlock.acquirelock1();
        };
        Runnable r2 = () -> {
            deadlock.acquireLock2();
        };
        new Thread(r1, "Thread1").start();
        new Thread(r2, "Thread2").start();
        System.out.println("Done");
    }

    public void acquirelock1() {
        System.out.println("aquiring lock 1 by thread " + Thread.currentThread().getName());
        synchronized (lock1) {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Acquired Lock1 by :" + Thread.currentThread().getName());
            acquireLock2();
        }
    }

    public void acquireLock2() {
        System.out.println(" aquiring lock2 by :" + Thread.currentThread().getName());
        synchronized (lock2) {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Acquired Lock2 by :" + Thread.currentThread().getName());
            acquirelock1();
        }
    }

}
