import java.util.Scanner;
public class ReadingInputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        System.out.println(name + " " + c + " " + d);
        int e = sc.nextInt();
        long mobileno = sc.nextLong();
        String line = sc.nextLine();
        System.out.println(e + " " + mobileno + " " + line);

        int sum = 0;
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            sum += sc.nextInt();
        }

        System.out.println("sum is " + sum);
    }
}
