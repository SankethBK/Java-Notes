class Test<T>{

    T obj;
    Test( T obj){
        this.obj = obj; // notice here there is no instance variable named obj but still it creates 
    }

    public T getObject(){
        return this.obj;
    }
}

// we can also pass more than 1 parameter 
class Test2 <T, U>{
    T obj1;
    U obj2;

    Test2(T o1, U o2){
        obj1 = o1;
        obj2 = o2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}


public class Generics1 {
    
    public static void main(String[] args){
        Test <Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
     
        Test <String> sObj = new Test<String>("Geeksforgeeks");
        System.out.println(sObj.getObject());

        Test2 <String, Integer> t2 = new Test2 <String, Integer> ("Gfg", 12);
        t2.print();
    }

}