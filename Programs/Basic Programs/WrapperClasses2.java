
public class WrapperClasses2 {
    public static void main(String[] args){
        Double d = 3.553;
        byte b = d.byteValue();
        int i = d.intValue();
        System.out.println(b + ","  + i);
        
        Number n = 9.3;
        print(n.intValue());

        Integer k = Integer.valueOf("123");
        System.out.println("k is " + k);

        k = Integer.valueOf("1110", 2);
        System.out.println("k is " + k);

        i = Integer.parseInt("1234");
        System.out.println("i is " + i);

        System.out.println("value contained in k is " + k.intValue());
    }

    public static void print(int k){
        System.out.println("Number is " + k);
    }
}