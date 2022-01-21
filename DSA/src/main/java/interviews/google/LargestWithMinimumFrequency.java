package interviews.google;

import java.util.LinkedHashMap;
import java.util.Map;

public class LargestWithMinimumFrequency {

    public static void main(String[] args) {
        int [] array={2, 2, 5, 50, 1};
        System.out.println(new LargestWithMinimumFrequency().largeButMinFreq(array,5));
    }
    int largeButMinFreq(int arr[], int n) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int number:arr){
            map.computeIfPresent(number,(Integer num,Integer num2)->{return ++num2;});
            map.putIfAbsent(number,1);


        }
        int MAX_VALUE=0;
        int MIN_FREQUENCY=Integer.MAX_VALUE;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(MAX_VALUE<entry.getKey() && MIN_FREQUENCY>=entry.getValue()){
               MAX_VALUE=entry.getKey();
               MIN_FREQUENCY=entry.getValue();
           }
       }
        System.out.println("Value :"+MAX_VALUE+" has the Min Frequency:"+MIN_FREQUENCY );
       return MAX_VALUE;
    }
}
