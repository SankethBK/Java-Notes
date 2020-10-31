
public class ExceptionHandling1 {
    
    public static void no(){
        System.out.println("no executed");
    }
    public static void main(String[] args){

        try{
            int i = 3/0;
        }
     
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally executed");
        }
        no();
    }
}