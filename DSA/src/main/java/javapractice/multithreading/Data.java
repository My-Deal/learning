package javapractice.multithreading;

public class Data {
    private String packet;
    private boolean transfer=true;

    public synchronized void send(String packet){
        while (!transfer){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.packet=packet;
            transfer=false;
            notify();
    }

    public synchronized String receive(){
        while (transfer){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        transfer=true;
        notify();
        return this.packet;
    }
}
