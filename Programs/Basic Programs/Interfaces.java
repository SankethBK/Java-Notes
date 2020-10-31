interface Player {
    int id = 2;
    void move();

    // Static and default are possible from java 8 onwards

    default void display(){
        System.out.println("Displaying player");
    }
    static void test(){
        System.out.println("Testing player");
    }
}

class TestClass implements Player {
    public void move(){
        System.out.println("Player is moving");
    }
    int id = 8;
}
public class Interfaces {
    public static void main(String[] args){
        Player P = new TestClass();
        P.move();
        System.out.println(Player.id);
        P.display();
        Player.test();
    }
}