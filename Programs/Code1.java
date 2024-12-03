import java.io.*;
public class Code1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("abc.txt");
        FileOutputStream fout = new FileOutputStream("xyz.txt");
        fin.close();
        fout.close();
    }
}
