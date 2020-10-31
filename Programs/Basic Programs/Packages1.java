package mypack;

public class Packages1 {
    public static void main(String[] args){
        System.out.println("in main");
    }
    public void m(){
        System.out.println("In packages1's m");
    }
}

class TestClass{
    public void f(){
        System.out.println("Inside f");
    }
}