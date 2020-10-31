class A {
    protected void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    @Override
    public void show(){
        super.show();
        System.out.println("In Class B");
    }
}
public class OverRide {
    public static void main(String[] args){
        B obj1 = new B();
        obj1.show();
        A obj2 = new A();
        obj2.show();
        A obj3 = new B(); // we will see this later
        obj3.show();      // In Class B
    }
}