
//creating our thread using runnable interface
class Mythread implements Runnable{
    //task of thread
    public void run(){
        System.out.println("start...");
        for(int i=1;i<=10;i++){
            System.out.println("value of i is : "+i);
            try{
                Thread.sleep(1000); //delay
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("end...");
    }

    public static void main(String[] args){

        //creating object of Mythread
        Mythread t = new Mythread();
        Thread thr = new Thread(t);
        thr.start();

        //creating object of MyAnotherThread
        MyAnotherThread t1 = new MyAnotherThread();
        t1.start();
    }
}

//----------------------------------------------------------------------------------

//creating  mythread using Thread class 

class MyAnotherThread extends Thread{
    //task for thread
    public void run(){
        System.out.println("start...");
        for(int i=10;i>=1;i--){
            System.out.println("value of another thread i is : "+i);
              try{
                Thread.sleep(2000);  //delay for printing
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("end...");
    }


    // public static void main(String[] args){
    //     MyAnotherThread t = new MyAnotherThread();
    //     t.start();
    // }
}