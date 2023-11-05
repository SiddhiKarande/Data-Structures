import java.util.*;

public class StackUsingDeque {
    
    static class Stack {
        static Deque<Integer> d = new LinkedList<>();
         //push
         public static void push(int data){
            d.addLast(data);
         }
        //pop
        public static int pop(){
            return d.removeLast();
        }
        //peek
        public static int peek(){
            return d.getLast();
        }
        
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        

    }
}
