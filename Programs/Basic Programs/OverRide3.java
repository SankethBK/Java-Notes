class A{
    int val = 200;
}

class B extends A {
    int val = 10;
}
public class OverRide3 {
    public static void main(String[] args){
        A obj = new B();
        B obj2 = (B)obj; // we can typecast like this 

        System.out.println(obj.val + "," + obj2.val);
    }
}