package work;

import java.util.List;

public class StreamMethode {
    public static void main(String[] args) {
        
        //1) filter methode:=  filter(Predicator)
        //joparyaant predicator true aahe to  prayant  filter return element karnar

        // //return name when name start with any letter
        // List<String> names = List.of("niranjan","shreya","ankita","adiraj");
        // names.stream().filter(e->e.startsWith("n")).forEach(i->{
        //     System.out.println(i);
        // });

       //---------------------------------------------------------------------------

        //2)map methode := map(function)
        //function reeturn value which is truee or false
        //using map we perform operations on every element
         //return number which is less than 10 
        List<Integer> num = List.of(1,2,50,10,23,5);
        num.stream().map(i->i<10).forEach(e->{
            System.out.println(e);
        });
    }
}
