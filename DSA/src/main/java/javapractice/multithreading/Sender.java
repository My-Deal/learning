package javapractice.multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {

    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        String[] packets = {"First packet", "Second packet", "Third packet", "Fourth packet", "Last packet","End"};
        for (String packet : packets) {
            data.send(packet);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                e.printStackTrace();
                Thread.currentThread().interrupt();
                System.out.println("current thread interrupted::" + Thread.currentThread().getName());
            }
        }
    }
}
