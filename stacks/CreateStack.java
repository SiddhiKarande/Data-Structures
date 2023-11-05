import java.util.ArrayList;

class CreateStack{

    static class Stack{
         static ArrayList<Integer> list = new ArrayList<>();
         //isEmpty
         static boolean isEmpty(){
                return list.size()==0;
            
         }
         //push
         static void push(int data){
             list.add(data);
         }
         //pop
         static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
         }
         //peek
         static int peek(){
            return list.get(list.size()-1);
         }

    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
        }
    }
}