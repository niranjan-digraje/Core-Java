

class company {
    int num;
    boolean f =  false;

    //f=false : chance : producer
    //f=true :  chance : consumer
    //producer methode
    synchronized public void prodouce_item(int n){
        if(f){
            try{
                wait();
            }catch(Exception e){

            }
        }
        this.num = n;
        System.out.println("Produce : "+this.num);
        f=true;
        notify();
    }

    //consumer methode
    synchronized public int consume_item(){
        if(!f){
            try{
                wait();
            }catch(Exception e){
                
            }
            
        }
        System.out.println("Consume : "+this.num);
        f = false;
        notify();
        return this.num;
    }

     public static void main(String[] args){
        company comp = new company();
        producer  p = new producer(comp);
        consumer c = new consumer(comp);
        p.start();
        c.start();
    }
}

class  producer extends Thread
{
    company c;
    producer(company c){
        this.c = c;
    }

    public void run(){
        int i=1;
        while(true)
        {
            this.c.prodouce_item(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            i++;
        }
        
    }
}

class  consumer extends Thread
{
    company c;
    consumer(company c){
        this.c = c;
    }

    public void run(){
        int i=1;
        while(true)
        {
            this.c.consume_item();
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
            i++;
        }
        
    }
}

// class Main{
   
// }
