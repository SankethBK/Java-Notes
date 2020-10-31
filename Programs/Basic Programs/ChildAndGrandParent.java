class GrandParent {
    public void print(){
        System.out.println("Grandparent's print");
    }
    public void g(){
        System.out.println("Heelo from g");
    }
}
class Parent extends GrandParent{
    public void print(){
        super.print();
        System.out.println("Parent's print");
    }
}
class Child  extends Parent {
    public void print(){
        super.print();
        System.out.println("Child's print");
    }
}


public class ChildAndGrandParent {
    public static void main(String[] args){
        Child c = new Child();
        c.print();
        c.g();
    }
}