package javapractice.multithreading;

public class Data {
    private String packet;
    private boolean transfer=true;

    public synchronized void send(String packet){
        while (!transfer){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.packet=packet;
            transfer=false;
            this.notify();
    }

    public synchronized String receive(){
        while (transfer){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        transfer=true;
        this.notify();
        return this.packet;
    }
}
