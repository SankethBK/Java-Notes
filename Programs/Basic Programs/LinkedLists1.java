import java.util.LinkedList;

public class LinkedLists1 {
    
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<Integer>();

        // methods 
    
        // add(Element e)
        // add(int index , Element e);
    
        for (int i = 0;i < 10; ++i){
            ll1.add(i);
        }
    
        ll1.add(1,3);
        System.out.println("Linked List is " + ll1);

        // addFirst(Object o); 

        ll1.addFirst(2);

        // addLast(Object o);

        ll1.addLast(5);
        System.out.println("Linked list after adding 2 at first and 5 at last is " + ll1);

        // addAll(Collection c);
        // addAll(int index, Collection c); 
        // clear(); 
        // clone(); -Shallow copy 
        // contains(Object o); 
        // descendingItertor() - returns iterator in reverse sequential order. 
        // get(int index);

        // getFirst(); - returns the first element 
        // getLast(); - returns the last element  - They don't remove elements 

        System.out.println("Firstelement = " + ll1.getFirst() + " last element = " + ll1.getLast() + " ll1 = " + ll1);

        // offer() 
        // offerLast() 
        // adds element at the end of the list 
        ll1.offer(8);
        ll1.offerLast(8);
        System.out.println("Linked list after adding using offer() and offerLast() " + ll1);

        // offerFirst() - adds at beginning 
        ll1.offerFirst(3);
        System.out.println("after adding using offerFirst " + ll1);

        // peek(), peekLast() - retrives but does not removes the last element 
        // peekFirst() - retrives but does not removes the first element

        // poll() , pollFirst() - retrives and removes the head
        // pollLast() - retrives and removes the last element 

        System.out.println("First element = " + ll1.pollFirst());
        System.out.println("Last element = " + ll1.pollLast());
        System.out.println("ll = " + ll1);

        // pop() - removes and returns the first element 
        // push() - adds element at head doesn't returns anything 
        '
    }

}