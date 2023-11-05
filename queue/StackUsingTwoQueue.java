import java.util.*;

public class StackUsingTwoQueue {

    static class QueueStack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){ // time complexity is O(n)
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public static int pop(){
            int top = -1;
            //case 1 : data in queue 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }

            }else{
                //case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
             int top = -1;
            //case 1 : data in queue 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    // if(q1.isEmpty()){
                    //     break;
                    // }
                    q2.add(top);
                }

            }else{
                //case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    // if(q2.isEmpty()){
                    //     break;
                    // }
                    q1.add(top);
                }
            }
            return top;
        }
        
    }
    public static void main(String args[]){
        QueueStack s = new QueueStack();
        s.push(100);
        s.push(200);
        s.push(300);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
