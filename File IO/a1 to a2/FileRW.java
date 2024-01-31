import java.io.*;

public class FileRW {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            File inFile = new File("in.txt");
            File outFile = new File("out.txt");
            FileReader fr = new FileReader(inFile);
            FileWriter  fw = new FileWriter(outFile);
            int ch=fr.read();
            while (ch!=-1) {
                fw.write(ch);
                break;
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("error...");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("i am in finaly");
        }
        System.out.println("end...");
    }
}
