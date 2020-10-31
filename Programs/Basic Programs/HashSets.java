import java.util.HashSet;

public class HashSets {
    public static void main(String[] args){

        HashSet<String> h = new HashSet<String>();

        // methods 
        // add(E e); returns true on success and false if element is already present 
        // contains(E e);
        // remove(E e); - removes if present 
        // clear(); 
        // size(); 

        h.add("India");
        h.add("Karnataka");
        h.add("Shimoga");
        System.out.println("Set = " + h);
        System.out.println("When we again try to add India " + h.add("India"));

        System.out.println("Set contains India ? " + h.contains("India"));
        System.out.println("Set contains Karnataka ? " + h.contains("Karnataka"));
        System.out.println("Set contains Shimoga ? " + h.contains("Shimoga"));

        h.remove("India");
        System.out.println("India removed");
        System.out.println("Set contains " + h.contains("India"));


    }
}