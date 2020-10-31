class A {
    A() {
        System.out.println("In A's default constructor");
    }
}

class B extends A{
    B(){
        this(3); // A's constructor is not called here as it is call to another constructor of B itself
        System.out.println("In B's default constructor");
    }
    B(int x){
        // A's default constructor is called here
        System.out.println("In B's parameterized constructor");
    }
}
public class ConstructorChaininig {
    public static void main(String[] args){
        B obj = new B();

    }
}