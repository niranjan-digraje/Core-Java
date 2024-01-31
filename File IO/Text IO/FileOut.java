import java.io.*;

public class FileOut {
    public static void main(String[] args) {
        System.out.println("start...");
        FileOutputStream ofile = null;
        byte b1[] = {'A','B'};
        try {
            ofile = new FileOutputStream("filein.txt");
            ofile.write(b1[0]);
            ofile.close();
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
