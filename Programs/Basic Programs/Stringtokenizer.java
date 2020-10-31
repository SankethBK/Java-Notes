import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main(String[] args){
        String s = "hello geeks how are you doing";
        StringTokenizer st1 = new StringTokenizer(s, " ");

        System.out.println("Number of tokens = " + st1.countTokens());
        while (st1.hasMoreTokens()){
            //  System.out.println("Number of tokens = " + st1.countTokens());
            System.out.println(st1.nextToken());
        }

        // nextElement() works similar to nextToekn but it returns object not string 
        
    }
}