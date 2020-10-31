
public class WrapperClasses3 {
    public static void main(String[] args){
        Integer i = 10;
        System.out.println(i.compareTo(7));
        System.out.println(i.compareTo(10));
        System.out.println(i.compareTo(11));

        Short s1 = 10;
        Integer i2 = 10;
        System.out.println("Same Integers compared but different objects through == " + (i == i2));
        System.out.println("Integer and Short of same numeric value compared with equals " + (s1.equals(i2)));

        System.out.println(Integer.toString(1245));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toHexString(32));
        System.out.println(Float.toString(1.23f));

        int val = 2;
        System.out.println("rotated through << " + (val << 2));
        System.out.println("rotated through rotateleft " + Integer.rotateLeft(i, 2));
        System.out.println("rotated through rotateright " + Integer.rotateRight(2, 1));

        System.out.println(Integer.decode("0x11"));

        System.out.println(Integer.compare(22, 22)); 

        System.out.println("Max value of integer " + Integer.MAX_VALUE);
        System.out.println("Min value of integer " + Integer.MIN_VALUE);
        System.out.println("Max value of double " + Double.MAX_VALUE);

        System.out.println(Character.isLetter(65));
        System.out.println(Character.isLetter(64));

        System.out.println(Character.isDigit('A')); 
        System.out.println(Character.isDigit('7'));

        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('a'));

        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));

        System.out.println(Character.toUpperCase('g'));
        System.out.println(Character.toLowerCase('J'));

        String s = Character.toString('k');
        System.out.println(s);

    }
}