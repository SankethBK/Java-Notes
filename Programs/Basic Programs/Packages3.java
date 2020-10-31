package mypack;

// Conclusion : we cannot use non public classes of a package from outside the package

public class Packages3 {
    public static void main(String[] args){
        mypack.TestClass t1 = new mypack.TestClass();
        mypack.Testclass2 t2 = new mypack.Testclass2();
        t1.f();
        t2.f();
    }
}