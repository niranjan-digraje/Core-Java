public class Thread_op {
    public static void main(String[] args){
        System.out.println("program started.....");

        int x = 56+34;
        System.out.println("sum is : "+x);

        //--------------------------------------------------------------------------

        //printing current thread name
        Thread t = Thread.currentThread();
        String tname  = t.getName();
        System.out.println("current thread name is : "+tname);

        //--------------------------------------------------------------------------

        //setname
        t.setName("Mymain");
        System.out.println("new Set name is : "+t.getName());

        //--------------------------------------------------------------------------

        //sleep mathode
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        //--------------------------------------------------------------------------

        //print the id of current thread
        System.out.println("id of current thread is :: "+t.threadId());

        //--------------------------------------------------------------------------

        System.out.println("program  ended.....");
    }
}
