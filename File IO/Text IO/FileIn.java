import java.io.*;

public class FileIn{
    public static void main(String args[]){
        System.out.println("start...");

        try{
            FileInputStream infile = new FileInputStream("filein.txt");
            int b = infile.read();
            while (b!=-1) {
                System.out.println((char)b);
                break;
            }
            infile.close();
        }
        catch(Exception e){
            System.out.println("error...");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am in finally");
        }
        System.out.println("end...");
        
    }
}