//run time polymorphism i.e.methode overriding

public class Person {
    public void detail(){
        System.out.println("basic detail of person");
    }
}

class employe extends Person{
    public void detail(){
        System.out.println("basic deatail of employe");
    }
}
