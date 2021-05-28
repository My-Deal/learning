package javapractice.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Function<String,Integer> function =(String s)->{ return 1;};
        BiFunction<String,Integer,Integer> biFunction=(String s,Integer i)->{ if (i!=null && i>0){
        return ++i;} return i;
        };
        map.computeIfAbsent("abc",(String s)->{ return 1;});
        map.computeIfPresent("abc",(String s,Integer i)->{ if (i!=null && i>0){
            return ++i;} return i;
        });
        System.out.println(map.get("abc"));
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            entry.getKey();
        }
    }

}
