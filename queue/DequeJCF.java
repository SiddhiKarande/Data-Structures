import java.util.*;

public class DequeJCF {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.removeFirst();

        System.out.println(dq);
    }
}
