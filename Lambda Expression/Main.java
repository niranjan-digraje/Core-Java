package work;

public class Main{
    public static void main(String[] args) {
        System.out.println("my system starts...");
        
        //1) this is first methode to implementing functional interface
        // MyInter myInter = new MyInterImpl();
        // myInter.sayHello();

        //--------------------------------------------------------------------------

        //2) create anonymous classes for  implimenting functional interface
        // MyInter i = new MyInter() {
        //     @Override
        //     public void sayHello(){
        //         System.out.println("this is first anonymous class");
        //     }
        // };
        // i.sayHello();

        //--------------------------------------------------------------------------

        //3) use lambada expression to implementing functional interface
        // MyInter i = ()->{
        //     System.out.println("this is first time using lambda expression");
        // };
        // i.sayHello();
        //------------------------------------------------------
        // MyInter i2 = ()->{
        //     System.out.println("this is second time using lambda expression");
        // };
        // i2.sayHello();

        //--------------------------------------------------------------------------
        //parameterised lambda expression
        // SumInter s = (a,b)->{
        //     return a+b;
        // };
        // System.out.println( s.sum(10,20));

        // LengthInter l = (s)->{
        //     return s.length();
        // };
        // System.out.println(l.li("niranjan"));
       
    }
}