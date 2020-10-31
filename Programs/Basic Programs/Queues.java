import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    
    public static void main(String[] args){

        // Queue is an interface in java 
        Queue<Integer> q = new LinkedList<>();

        // There multiple ways of doing same things , but we will stick to standard methods 

        // add(e) ; adds e to the tail of the queue 
        // offer(e)
        for (int i = 0 ; i < 5 ; ++i){
            q.add(i);
        }
        q.offer(6);
        q.offer(7);

        System.out.println("Queue  is " + q);

        // peek() - retirves , but not removes the head element 

        System.out.println("First element peeked " + q.peek());

        // poll() - removes and returns the first element 

        System.out.println("First element polled " + q.poll() + " Queue is " + q);

        // size() - returns the number of elements in the queue

        int size = q.size();
        for (int i = 0; i < size - 2; ++i){
            System.out.println("polled element = " + q.poll());
        }
        
        // isEmpty() - true or false 
        System.out.println("Is Queue empty = " + q.isEmpty() + " q = " + q);

        // clear() - removes all the elements 
        q.clear();
        System.out.println("Is Queue empty = " + q.isEmpty());           
    }

}