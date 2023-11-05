import java.util.*;

public class QueueUsingDeque {

    static class Queue{
        static Deque<Integer> dq = new LinkedList<>();
        //add
        public static void add(int data){
            dq.addLast(data);
        }
        //remove
        public static int remove(){
            return dq.removeFirst();
        }
        //peek
        public static int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(0);
        q.add(1);
        q.add(2);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
