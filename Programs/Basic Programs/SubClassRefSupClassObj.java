class A {
    int a = 2;
    public void pointBreak(){
        System.out.println("Point break");
    }
    public static void fun(){
        System.out.println("In A's fun");
    }
}

class B extends A {
    int b = 4;
    public void pointBreak(){
        System.out.println("Thor is point break");
    }
    public static void fun(){
        System.out.println("In B's fun");
    }

}
public class SubClassRefSupClassObj {
    public static void main(String[] args){
        A o1 = new B();
        System.out.println(o1.a);
        o1.pointBreak();  // class B's method is executed 
        //System.out.println(o1.b);  // error with class A's reference we cannot access B's variables

        // For overrided static methods it is not true that always subclass's method is executed
        // For a given reference variable, it;s static class is executed
        
        B.fun(); // In B's fun 
        A.fun(); // In A's fun  
    }
}