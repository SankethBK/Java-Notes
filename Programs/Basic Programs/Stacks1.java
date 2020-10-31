import java.util.*;

public class Stacks1 {

    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<Integer>();

        // methods 
        // push(e);
        // pop() ; returns and removes top element
        // peek() ; returns top element 
        // isEmpty(); 
        // size(); 
        
        for (int i = 0; i < 10; ++i){
            s1.push(i);
        }
        
        System.out.println("Stack is " + s1);
        System.out.println("Size of stack is " + s1.size());
        System.out.println("Element peeked = " + s1.peek());

        while (!s1.isEmpty()){
            System.out.println("popped element " + s1.pop());
        }
    }


}