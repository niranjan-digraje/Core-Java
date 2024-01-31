public class Main{
    public static void main(String[] args) {
        // //compile time polymorphism
        // student st = new student();
        // //st.read();
        // st.read("java");
        //------------------------------------------------------

        //run time polymorphism
        //Person per = new Person();
        Person per = new employe();
        per.detail();
    }
}