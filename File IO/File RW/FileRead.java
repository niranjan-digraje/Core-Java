import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            File inFile = new File("frw.txt");
            FileReader fr = new FileReader(inFile);
            int ch = fr.read();
            while(ch != -1){
                System.out.println((char)ch);
                //break;
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("error...");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am finnaly");
        }
        System.out.println("end...");
        

    }
}
