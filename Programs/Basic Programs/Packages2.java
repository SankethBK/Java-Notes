package mypack;

public class Packages2 {
    public static void main(String[] args){
        Packages2 p2 = new Packages2();
        p2.m();
        System.out.println("In packages2 main");
    }
    public void m(){
        System.out.println("In packages2's m");
    }
}
class Testclass2 {
    public void f(){
        System.out.println("In tstclass2");
    }
}