class MyException extends Exception {

    MyException(){ }

    MyException(String str){
        super(str);
    }
}
public class ExceptionHandling2 {
    
    public static void main(String[] args){
        int a = 1000;

        try{
            if (a == 1000){
                MyException me = new MyException("Hey yo trun the beat up a little bit");
                throw me;
            }
        }

        catch (MyException  mye){
            System.out.println(mye.getMessage());
        }

    }
}