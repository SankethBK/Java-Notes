class A{
    static void test(){
        System.out.println("In class A");
    }
}

class B extends A{
    static void test(){
        System.out.println("In class B");
    }
}
public class OverRide2 {
    public static void main(String[] args){
        B.test();
        A.test();
    }
}