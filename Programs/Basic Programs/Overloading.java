class A{
    public void test(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void test(int x){
        System.out.println("In class B 1");
    }

    public void test(int x, int y){
        System.out.println("In class B 2");
    }
}


public class Overloading {
    public static void main(String[] args){
        B obj = new B();
        obj.test();
        obj.test(6);
        obj.test(9,5);
        A obj1 = new B(); // this is another very interesting concept we will see in next file 
        obj1.test();

    }
}