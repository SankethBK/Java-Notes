public class Enums2 {
    
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args){
        Color c1 = Color.GREEN;
        if (c1 == Color.GREEN){
            System.out.println("Color is green");
        }

        Color c2 = Color.BLUE;
        switch(c2){
            case RED: System.out.print("Color is RED"); break;
            case GREEN: System.out.println("Color is Green"); break;
            case BLUE: System.out.println("Color is Blue");
        }
    }

}
