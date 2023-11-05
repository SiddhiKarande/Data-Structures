import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(100);
        q.add(200);
        q.add(300);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
