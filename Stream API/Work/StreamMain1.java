package work;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1{

    public static void main(String[] args) {
        //create list and filter all even number from list

        //create list using collection framework
        List<Integer> list1 = List.of(2,4,50,21,22,67);
        System.out.println("original list : "+list1);

        //--------------------------------------------------------------------------

        //filter even  number without stream
        List<Integer> listeven = new ArrayList<>();

        for(Integer i : list1){
            if(i % 2 == 0){
                listeven.add(i);
            }
        }
        System.out.println("even list without stream : "+listeven);

        //--------------------------------------------------------------------------

        //filter even number using stram API
        //Stream<Integer> stream = list1.stream();
        //List<Integer>newlist = stream.filter(i-> i%2==0).collect(Collectors.toList());
        List<Integer>newlist = list1.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println("even list using Stream API : "+newlist);

        //--------------------------------------------------------------------------

    }
}
