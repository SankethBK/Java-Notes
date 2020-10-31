import java.io.*;
public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        int a = Integer.parseInt(bf.readLine());
        System.out.println("Enter a string");
        String b = bf.readLine();
        System.out.println("Ypu entered " + a + " " + b);

    }
}