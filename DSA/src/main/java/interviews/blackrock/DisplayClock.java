package interviews.blackrock;

public class DisplayClock {

    public static void main(String[] args) {
        try {
            printIncrementer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void printIncrementer() throws InterruptedException {
        int timeInterval=10;
        int sum=timeInterval;
        while (true){

            Thread.sleep(timeInterval*1000);
            System.out.println(sum);

            sum+=timeInterval;

        }


    }
}
