//create custom exception
// class AgeInvalidExceptiion extends Exception
// {
//     AgeInvalidExceptiion()
//     {
//         super("age is invalid");
//     }
//     AgeInvalidExceptiion(String message)
//     {
//         super(message);
//     }
// }

class example{
    public static void main(String[] args){
        System.out.println("Started...");
        try{
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("we have get two number");
            int result = n1/n2;
            System.out.println("Division is : "+result);

            //custome exception
            // if(n2<10){
            //     //throw new AgeInvalidExceptiion("age is invalid");
            //     throw new AgeInvalidExceptiion();
            // }
        }
        // }catch(ArithmeticException e){  //catch for n2 =0
        //     System.out.println("n2 can not be 0");
        //     System.out.println(e.getMessage());
        // }catch(NumberFormatException e){ //cattch of invalid number
        //     System.out.println("invalid number..");
        //     System.out.println(e.getMessage());
        catch(Exception e){
            System.out.println("error!!");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am in final block");
        }
        System.out.println("Ended...");
    }
}