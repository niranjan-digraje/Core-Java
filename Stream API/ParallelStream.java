import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void  square(int i ){
        int result = i*i;
        System.out.println("Square of "+i+" is "+result);
    }

    public static void main(String[] args) {
        //create  arraylist for 1000 number
        List<Integer> number = new ArrayList<>();
        for(int  i = 1;i<=1000;i++){
            number.add(i);
        }

        //use of parallel stream to call square function
        number.parallelStream().forEach(ParallelStream::square);
    }
}
