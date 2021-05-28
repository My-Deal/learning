package javapractice.cvent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String [] args){
        List<String> list=List.of("23");
        test test=new test();
        list.stream().forEach(number->{
            System.out.println(" total divisible count is ::>>"+test.solution(number));
        });


    }

    public int solution(String S){
        Set<Integer> set=new HashSet<>();
        int [] array;
        if(S!=null && !S.isEmpty()){
            array=getArray(S);
            printArray(array);
            for (int i=0;i< array.length;i++){
                getDivisibleNumbers(array,i,set);
            }
        }
        return set.size();
    }
    private void getDivisibleNumbers(int [] array,int index,Set<Integer> set){

        int [] copy= array.clone();
        for (int i=0;i<10;i++){
            copy[index]=i;
            int result;
            if((result=getNumberFromArray(copy))%3==0){
                System.out.println(" is divisible by 3:>>"+result);
                    set.add(result);
            }
        }

    }

    private int getNumberFromArray(int [] array){
        int number=0;
        for (int i=0;i<array.length;i++){
            number=number*10+array[i];
        }
        return number;
    }
    private int[] getArray(String S){
        int []array=new int[S.length()];
        int number=Integer.parseInt(S);
        int lengthCounter=S.length()-1;
        while (number>0){
            array[lengthCounter--]=number%10;
            number=number/10;
        }
        return array;
    }

    private void printArray(int[] array){
        int counter=0;
        while (counter<array.length){
            System.out.println(array[counter++]);
        }
    }
}
