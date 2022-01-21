package javapractice.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        Map<String,Integer> map=Map.of("hello",1,"Hello",2,"world",5,"suno",2);
        lazyAndEagerStreamMethods();
    }


      static void lazyAndEagerStreamMethods(){
          List<String> list=List.of("Hello","how","are","you");
          list.stream()
                  .filter(artist-> {System.out.println(artist);
                  return artist.equalsIgnoreCase("you");})
          .count();
          List<String> stringList=List.of("1","2","3","4","5");
         List<Integer> integerList= stringList.stream().map(Integer::parseInt).collect(Collectors.toList());

    integerList.stream().forEach(System.out::println);
    }

}
