import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.ListIterator;

public class ArrayLists1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<>();
        for (int i = 0; i < 11; ++i){
            al.add(i);
            al2.add(i+1);
            al3.add(i);
        }


        // methods

        // forEach(compatible method);
        al.forEach((n) -> System.out.println(n));

        // retainAll(Collection c); - retains all the elements present in Collection c
        al.retainAll(al2);
        System.out.println("After retaining " + al);

        // removeIf(predicate) - removes all the elements which satisfy a particular condition 
        al2.removeIf((n) -> (n%3 == 0));
        System.out.println("After removing multiples of 3 " + al2);

        // contains(Object);  - returns true if the ArrayList constains that element 
        System.out.println(al.contains(3));

        // remove(Object o);
        // remove(int index);

        // What happens when an arraylist is of Integer type. 
        // to remove index use remove(1);
        // to remove object use remove(Integer.valueOf(4));

        al2.remove(1);
        al2.remove(Integer.valueOf(4));
        System.out.println("After removing using remove " + al2);

        // get(index); - returns the element at the given index 
        System.out.println("Element at index 2 = " + al2.get(2));


        // subList(int fromIndex, int endIndex);  - returns a sublist 
        System.out.println("SubList from index [1 to 5) " + al2.subList(1, 5));

        // set(int index. Element e); - replaces the element at index with element e , returns the replaced elemeent 
        System.out.println("Replacing element at index 1 with 5 " + al2.set(1,5) + al2);

        // size() - returns the number of elements , note that length was an attribute in arrays and strings, while here size is a method 
        System.out.println("Size of array = " + al2.size());

        // removeAll(Collection c); removes all the elements in c, returns true if the list changed. 
        System.out.println("Removing using removeAll " + al2.removeAll(al));

        al2 = new ArrayList<Integer>(al3);
        System.out.println("al2 reseeted");


        // listIterator() - returns a listIterator 

        ListIterator<Integer> litr = al2.listIterator();

        System.out.println("Traversing using list iterator");
        while (litr.hasNext()){
            System.out.println("value is " + litr.next());
        }

        // ensureCapacity(int capacity); - increases the capacity of arraylist to hold more elemets
        al2.ensureCapacity(20);

        // isEmpty() 
        System.out.println("al2 is empty " + al2.isEmpty());

        // removeRange(int fromIndex, int toIndex); - removes the range , doesn't returns anything 
        // It has protected access so we cannot directly use it. 
        // al2.removeRange(3,6); - 
        // System.out.println("Removing elements [3,6) " + al2);

        // void clear()
        al2.clear();
        System.out.println("After clearing size of al2 is " + al2.size());
        
        al2 = new ArrayList<Integer>(al3);
        System.out.println("al3 is resseted");
        
        // add(Object o) - appends the object 
        // add(int index, Onject o) - inserts o at index 
        
        al2.add(2, 4);
        System.out.println("Inserted element 4 at index 2 " + al2);

        // trimToSize() - trims the arraylists capacity to current capaccity 
        al2.trimToSize();

        // indexOf(Object o); - returns index of first occurence, -1 otherwise 
        System.out.println("Index of 7 is " + al2.indexOf(7));

        // lastIndexOf(Object o); - returns the index of last occurence of o, -1 otherwise 
        System.out.println("Index of Last occurence of 4 is " + al2.lastIndexOf(4));

        // clone() - creates a deepCopy but protected method 

        // toArray() - returns the Array form Object[]

        Object[] a = al2.toArray();
        System.out.println("ArrayList al2 converted to array "  + Arrays.toString(a));

        // T[] toArray(T[] arr); we have to pass empty array of type T in that array , elements of ArrayList are unpacked. 

        Integer[] b = new Integer[al2.size()];
        b = al2.toArray(b);
        System.out.println("Integer array b is " + Arrays.toString(b));

        // addAll(Coolection c); - appends the elements of COllection c 

        al2.addAll(al3);
        System.out.println("added using addAll " + al2);

        // addAll(int index, Collection c); inserts all the elements of c , at index 

        al2 = new ArrayList<Integer>(al3);
        System.out.println("al2 is resseted");
        al2.addAll(6,al2);
        System.out.println("al2 is inserted at index 6 in al2 " + al2);

    }
}