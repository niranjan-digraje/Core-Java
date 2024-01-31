//compile time polymorphism  i.e.methode overloading

public class student {
    public void read(){
        System.out.println("student is reading xxyz book");
    }

    public void read(String bookname){
        System.out.println("student is reading "+bookname+" book");
    }
}
