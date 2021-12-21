package interviews.clearwater;

import java.util.*;
import java.util.function.BiFunction;

public class ClearWater {
    public static int minSum(List<Integer> num, int k) {

       Comparator<Integer> comparator= Comparator.reverseOrder();
        int sum=0;
        Map<Integer, Integer> treeMap = new TreeMap<>(comparator);
        BiFunction<Integer, Integer, Integer> function = (Integer value, Integer count) -> {
            return ++count;
        };
       for(Integer number:num){
           treeMap.computeIfPresent(number, function);
            treeMap.putIfAbsent(number, 1);
            sum+=number;
        }
        System.out.println("Sum:"+sum);
        for (int i=1;i<=k;i++){
            int key=treeMap.keySet().stream().findFirst().get();
            int value=treeMap.get(key);
            int half=getHalf(key);
            System.out.println("half:"+half);
            if(value==1){
                treeMap.remove(key);
            }
            else{
                treeMap.put(key,treeMap.get(key)-1);
            }
            treeMap.computeIfPresent(half,(Integer key1,Integer value1 )->{
               return ++value1;
            });
            treeMap.putIfAbsent(half,1);
        sum=sum-(key-half);
            System.out.println("After k="+i+" sum is :"+sum+" and half is "+half);
        }

        return sum;
    }

    private static int getHalf(int value){
        double dValue=value;
        return (int)Math.ceil(dValue/2);
    }

    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,1,3,1,2,1,4,5,1,2,3,4,1,2,3,50000);
        System.out.println(minSum(list,10));
    }
}

