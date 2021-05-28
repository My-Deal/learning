package javapractice.multithreading;

public class WaitNotifyNotifyAll {

    public static void main(String[] args) {
        Data data=new Data();
        Sender sender=new Sender(data);
        Receiver receiver=new Receiver(data);
        Thread rt=new Thread(receiver,receiver.getClass().getName());
        Thread st=new Thread(sender,sender.getClass().getName());
        rt.start();
        st.start();
        System.out.println("Main exiting");
    }

}
