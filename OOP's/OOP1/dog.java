public class dog extends Animal {
    int x =  4;

    public dog(){
        super();   //parent class constructor calling
    }

    public void speak(){
        System.out.println("parent element : "+super.x);  //super keyword
        System.out.println("current element : "+this.x);
    }
    
}
