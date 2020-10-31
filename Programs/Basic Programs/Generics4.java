class Bound <T extends A>{

    private T obj;

    public Bound(T obj){
        this.obj = obj;
    }

    public void doRunTest(){
        this.obj.displayClass();
    }
}

class A {
    public void displayClass(){
        System.out.println("Inside class A");
    }
}

class B extends A {
    public void displayClass(){
        System.out.println("Inside class B");
    }
}

class C extends A {
    public void displayClass(){
        System.out.println("Inside class C");
    }
}


public class Generics4 {
    
    public static void main(String[] args){
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();
        Bound<B> beB = new Bound<B>(new B());
        beB.doRunTest();
        Bound<A> beA = new Bound<A>(new A());
        beA.doRunTest();        
    }
}