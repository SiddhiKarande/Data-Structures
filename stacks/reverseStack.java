import java.util.Stack;

public class reverseStack {

    public static void pushAtBottom(int data ,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverseTheStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseTheStack(s);
        pushAtBottom(top, s);
    }
    
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseTheStack(s);

        while(!s.empty()){
            System.out.println(s.pop());
        }

    }
}
