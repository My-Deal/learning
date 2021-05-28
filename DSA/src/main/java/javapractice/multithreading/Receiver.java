package javapractice.multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable{
    private Data data;
    public Receiver(Data data){
        this.data=data;
    }


    @Override
    public void run() {
        String packet=data.receive();
        while (packet!=null && !packet.contains("End")){
            System.out.println("recieved massage::"+packet);
            packet=data.receive();
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                e.printStackTrace();
                Thread.currentThread().interrupt();
                System.out.println(" interrupted current thread "+Thread.currentThread().getName());
            }

        }
    }
}
