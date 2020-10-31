class A{
    public static int i;
    static {
        i = 5;
        System.out.println("Static block");
    }
    A(){
        System.out.println("COnstructor");
    }

}

public class StaticInitBlocks {
    public static void main(String[] args){
        System.out.println(A.i);
    }
}