enum Color { 
    RED, GREEN, BLUE; 
} 


public class Enum3 {
    
    public static void main(String[] args){
        Color arr[] = Color.values();

        for (Color col : arr){
            // calling ordinal to find index()
            System.out.println("Index of " + col + " is " + col.ordinal());
        }

        // using valueOf()
        System.out.println(Color.valueOf("RED"));
        // IllegalArgumentException can be raised if an unknown color is passed

    }
}