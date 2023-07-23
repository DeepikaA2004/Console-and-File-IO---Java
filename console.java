import java.io.*;

public class CopyFile {
public static void main(String args[]) throws IOException {
FileInputStream in = null;
FileOutputStream out = null;
cin = new InputStreamReader(System.in);
System.out.println("Enter characters, 'q' to quit.");
char c;
do {
c = (char) cin.read();
System.out.print(c);
} while(c != 'q');
}finally

    {
if (cin != null) {
cin.close();
}
16
}try
    {
        in = new FileInputStream("input.txt");
        out = new FileOutputStream("output.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
    }finally
    {
        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }
}}