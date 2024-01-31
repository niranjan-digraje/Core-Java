import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            File outFile = new File("frw.txt");
            FileWriter fw = new FileWriter(outFile);
            String s = "abc";
            fw.write(s);
            fw.close();

        } catch (Exception e) {
            System.out.println("error...");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am in finally");
        }
        System.out.println("end...");
    }
}
