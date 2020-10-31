
enum Color {
    RED, GREEN, BLUE
}

class ColorByClass {
    public static final ColorByClass RED = new ColorByClass();
    public static final ColorByClass GREEN = new ColorByClass();
    public static final ColorByClass BLUE = new ColorByClass();
}

public class Enums1 {
    public static void main(String[] args){
        Color c1 = Color.RED;
        ColorByClass c2 = ColorByClass.BLUE;
        System.out.println(c1);
        System.out.println(c2); // will print olorByClass@7440e464 that i don't know what
    }
}