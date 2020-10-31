class A {
    int m;
    A(){
        this(2);
    }
    A(int x){
        m = x;
    }

    public void show(){
        System.out.println("In class A m = " + m);
    }
}

class B extends A{
    int m;
    B(){
        super();
        m = 3;
    }

    public void show(){
        super.show();
        System.out.println("In class B m = " + m);
    }
}
public class ThisAndSuper {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}