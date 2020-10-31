import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0;i < 10; ++i){
            al.add(i);
        }

        System.out.println(al);

        Iterator it = al.iterator();

        while (it.hasNext()){

            int i = (Integer)it.next(); // we need to typecast it to Integer class because it returns Object class 
            System.out.println(i + " ");
            
            if (i%2 == 0){
                it.remove();
            }

        }

        System.out.println(al);
    }


    
}