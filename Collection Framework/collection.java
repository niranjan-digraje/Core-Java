import java.util.*;

public class collection{
    public static void main(String[] args){
        System.out.println("welcome to collection framework");

        //type safe collection of list
        //following  all operation are saame for all list and sets

        //ArrayList
        //creating arraylist
        ArrayList<String> names = new ArrayList<>();

        //------------------------------------------------------

        //dynamic adding elements in arraylist
        names.add("niranjan");
        names.add("tejas");
        names.add("archit");
        names.add("kunal");
        names.add("abhijit");

        //------------------------------------------------------

        //printing arraylist
        System.out.println(names);

        //------------------------------------------------------

        // //printing element at perticular index
        // System.out.println(names.get(1));

        //------------------------------------------------------

        // //removing element
        // names.remove("kunal");
        // names.remove(2);
        // System.out.println(names);

        //------------------------------------------------------

        // //size of arraylist
        // System.out.println(names.size());

        //------------------------------------------------------

        // //cheack element is present or not
        // System.out.println(names.contains("niranjan"));
        // System.out.println(names.contains("abhi"));

        //------------------------------------------------------

        // //cheack for arraylist is empty or not
        // System.out.println(names.isEmpty());

        //------------------------------------------------------

        // //set the element at particular index and remoove old element 
        // names.set(3,"abhi");
        // System.out.println(names);

        //------------------------------------------------------

        // //add element at particular inddex
        // names.add(3,"shreyas");
        // System.out.println(names);

        //------------------------------------------------------

        // //remove all element from list
        // names.clear();
        // System.out.println(names);

        //--------------------------------------------------------------------------

        
        //--------------------------------------------------------------------------
        //-------------------
        //traversal of list
        //-------------------

        // //traversal using for-each loop
        // for(String  str : names){
        //      System.out.print(str+"\t"+str.length()+"\t");

        //      //reversing string
        //      StringBuffer  br = new StringBuffer(str);
        //      System.out.println(br.reverse());
        // }

        //------------------------------------------------------

        // //traversing using iterator
        // //forward traversal
        
        // Iterator<String> itr = names.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        //------------------------------------------------------

        // //traversing using listiterator
        // //backword traversing

        // ListIterator<String> litr = names.listIterator(names.size());
        // while(litr.hasPrevious()){
        //     System.out.println(litr.previous());
        // }

        //------------------------------------------------------

        // //traversing using for-each methode
        // names.forEach(str->{
        //     System.out.println(str);
        // });

        //--------------------------------------------------------------------------

        // //type of unsafe list

        // //linked list
        // //creating linked list
        // LinkedList list = new LinkedList();
        // list.add("niranjansd");
        // list.add("_");
        // list.add(1908);
        // list.add(true);

        // //printing linked list
        // System.out.println(list);

        //--------------------------------------------------------------------------


    }
}