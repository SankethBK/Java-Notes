import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueues {
    public static void main(String[] args){
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(25);

        // we will use same basic methods offer, poll, isEmpty ,peek, size, clear 
        for (int i = 9; i > 0; --i){
            pq.add(i);
        }

        System.out.println("PriorityQueue = " + pq);
        System.out.println("First element peeked " + pq.peek());

        while (!pq.isEmpty()){
            System.out.println("Element polled = " + pq.poll());
        }


        // To add custom comparator 
        
        Comparator<String> customComparator = new StringLengthComparator();
        PriorityQueue<String> pq1 = new PriorityQueue<>(10, customComparator);

        pq1.offer("Medium");
        pq1.offer("Small");
        pq1.offer("Pretty Large");

        while (!pq1.isEmpty()){
            System.out.println("Polled element = " + pq1.poll());
        }

         // To do the same thing in one line

        pq1 = new PriorityQueue<String>(10, (a,b) -> a.length() - b.length());

        pq1.offer("Medium");
        pq1.offer("Small");
        pq1.offer("Pretty Large");

        while (!pq1.isEmpty()){
            System.out.println("Polled element = " + pq1.poll());
        }

    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y){
        if (x.length() > y.length()){
            return 1;
        }
        else if (y.length() > x.length()){
            return -1;
        }
        return 0;
    }
}