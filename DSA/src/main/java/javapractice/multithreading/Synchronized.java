package javapractice.multithreading;

public class Synchronized {
    Object object = new Object();

    public static void main(String[] args) {
        Synchronized s = new Synchronized();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                s.method1();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                s.method2();
            }
        }).start();

    }

    public synchronized void method1() {
        System.out.println("enter critical section by thread ::" + Thread.currentThread().getName());
        System.out.println("going to sleep");
        try {
            Thread.sleep(1000000);
            System.out.println(" woke up from sleep "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void method2() {
        System.out.println("enter critical section by thread ::" + Thread.currentThread().getName());
    }
}
