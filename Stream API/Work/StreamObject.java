package work;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //how to  collect object

        //1)  empty object
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(i->{
            System.out.println("empty stream  :"+i);
        });

        //--------------------------------------------------------------------------
        
        //2) of object
        String names[] = {"niranjan","shreya","ankita","adiraj"};
        Stream<String> stream1  = Stream.of(names);
        stream1.forEach(i->{
            System.out.println(i);
        });
    }
}
