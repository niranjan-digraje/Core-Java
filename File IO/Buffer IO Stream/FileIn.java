import java.io.*;

public class FileIn{
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            FileInputStream fin = new FileInputStream("file.txt");
            BufferedInputStream  b2 = new BufferedInputStream(fin);
            int ch = b2.read();
            while (ch != -1) {
                System.out.println((char)ch);
                break;
            }
            fin.close();
            b2.close();

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