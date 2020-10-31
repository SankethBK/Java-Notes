class A{
    final int i = 9;
    final int j;
    final int k;

    A(){
        k = 7;
    }

    {
        j = 9;
    }
}

public class FinalVariables2 {
    public static void main(String[] args){
        A obj1 = new A();
        System.out.println(obj1.i + " " + obj1.j + " " + obj1.k);
    }
}