import java.io.*;

public class FileOut {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            FileOutputStream fout = new FileOutputStream("file.txt");
            BufferedOutputStream b1 = new BufferedOutputStream(fout);
            String s = "niranjan";
            byte b[] = s.getBytes();
            b1.write(b);
            b1.close();
            fout.close();
        } catch (Exception e) {
            System.out.println("error...");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am in finaally");
        }
        System.out.println("end...");
    }
}
