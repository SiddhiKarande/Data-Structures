import java.util.*;

public class QueueUsingTwoStack {

    static class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void add(int data){
        // if(s1.isEmpty()){
        //     s1.push(data);
        // }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
         s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static int remove(){
        if(s1.empty()){
            return -1;
        }
        return s1.pop();
    }

    public static int peek(){
        if(s1.empty()){
            return -1;
        }
        return s1.peek();
    }
        
    }
    public static void main(String args[]){
        Queue q =new Queue();
        q.add(100);
        q.add(200);
        q.add(300);

        while (! q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
