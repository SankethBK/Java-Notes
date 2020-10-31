public class Generics2 {
    
    static <T> void GenericDisplay(T element){
        System.out.println(element.getClass().getName() + " " + element);
    }

    public static void main(String[] args){
        GenericDisplay("Geeksforgeeks");
        GenericDisplay(15);
    }
}