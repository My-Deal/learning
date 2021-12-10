package javapractice.multithreading;

public class EvenOddWithWaitNotify {
    private volatile int count=0;

    private int limit;

    public EvenOddWithWaitNotify(int limit) {
        this.limit = limit;
    }

    public void printEven(){
        synchronized (this){
            while (count < limit ){
                while (count%2==1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+": count ="+count);
                count++;
                notify();
            }
        }

    }

    public void printOdd(){
        synchronized (this){
            while (count<limit){
                while (count%2==0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+": count ="+count);
                count++;
                notify();
            }
        }

    }

    public static void main(String[] args) {
        EvenOddWithWaitNotify evenOddWithWaitNotify=new EvenOddWithWaitNotify(20);
        Thread even=new Thread(()->{evenOddWithWaitNotify.printEven();},"Even-Thread");
        Thread odd=new Thread(()->{evenOddWithWaitNotify.printOdd();},"Odd-Thread");
        even.start();
        odd.start();
    }
}
