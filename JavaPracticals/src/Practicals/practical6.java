package Practicals;
import java.io.*;
public class practical6 {
    public static void main(String[] args) {
        try {
            File inf = new File("src/Practicals/file1.txt");
            File outf = new File("src/Practicals/file2.txt");
            FileReader in = new FileReader(inf);
            FileWriter out = new FileWriter(outf);
            int c;
            while ((c = in.read()) != -1){
                out.write((char)c);
            }
            in.close();
            out.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
