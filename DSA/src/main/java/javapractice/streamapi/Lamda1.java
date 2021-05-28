package javapractice.streamapi;

import java.util.function.BinaryOperator;

public class Lamda1 {
    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println("print in Runnable");
        BinaryOperator<Integer> add=(x,y)->{ return x+y;};
        performCalculation(10,1,add);

    }

    public static void performCalculation(Integer x,Integer y,BinaryOperator<Integer> operator ){
        System.out.println(" result is :"+operator.apply(x,y));
    }
}
