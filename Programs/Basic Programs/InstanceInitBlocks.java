class A {
    A(){
        System.out.println("A's constructor");
    }
    {
        System.out.println("A's IIB");
    }
}

class B extends A {
    B(){
        System.out.println("B's constructor");
    }
    {
        System.out.println("B's IIB");
    }
}

public class InstanceInitBlocks {
    public static void main(String[] args){
        B obj = new B();
    }
}