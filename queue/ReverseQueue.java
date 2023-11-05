import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.sound.midi.Soundbank;

public class ReverseQueue {
    
    public static void revese(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>() ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        revese(q);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
