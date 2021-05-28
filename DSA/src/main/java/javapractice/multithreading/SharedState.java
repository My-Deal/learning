/*
package javapractice.multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedState {
   AtomicInteger atomicInteger=new AtomicInteger();


    public void increment1() {
        System.out.println("access by " + Thread.currentThread().getName());
        synchronized (lock1) {
           state=state+1;
        }
        try {
            Thread.sleep(100000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void increment2() {
        System.out.println("acces by " + Thread.currentThread().getName());
        synchronized (lock2) {
            state2--;
        }
    }

    public static void main(String[] args) {
        SharedState state = new SharedState();
        new Thread(() -> {
            state.increment1();
        }).start();
        new Thread(() -> {
            state.increment2();
        }).start();
    }
}
*/
