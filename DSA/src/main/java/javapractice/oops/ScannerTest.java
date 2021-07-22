package javapractice.oops;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ScannerTest {
    public static void main(String[] args) {
        AtomicInteger counter=new AtomicInteger(0);
        counter.getAndIncrement();
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d=scan.nextDouble();
        //scan=scan.skip(" ");
        String s=scan.nextLine();
        System.out.println(s);
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
