package javapractice.generics;

import java.util.ArrayList;
import java.util.List;

public class NumberType {
    public static void main(String[] args) {
        List<Double> list=new ArrayList<>();
        //list.add(new Integer(123));
doSomething(list);
char ch='a';
        System.out.println(ch);
        System.out.println(ch+ch);
        System.out.println(ch-ch);


    }

    static public  void doSomething(List<? extends Number> list){
//list.add(new Double(32.2));
    }
}
