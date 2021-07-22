package javapractice.oops;

import java.io.IOException;

public class Inheritence implements Inheritence2,Inheritence1 {

    public static void main(String[] args) {
            Inheritence1 in1=new Inheritence();
            in1.doSomething();
            Inheritence2 in2=new Inheritence();
            in2.doSomething();
    }

    @Override
    public void doSomething()  {
        System.out.println("hello");
    }
}
interface Inheritence1{
    public void doSomething() ;
}

interface Inheritence2{
    public void doSomething() ;
}
