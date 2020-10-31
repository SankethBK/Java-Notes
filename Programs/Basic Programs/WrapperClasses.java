
public class WrapperClasses {
    public static void main(String[] args){
        Integer i = 8;
        System.out.println(System.identityHashCode(i));
        modify(i);
        System.out.println(i);
    }

    public static void modify(Integer i){
        i = i + 1;
        System.out.println(System.identityHashCode(i)); // same with i++
    }
}