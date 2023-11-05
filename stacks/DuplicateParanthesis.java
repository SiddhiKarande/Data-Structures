import java.util.Stack;

public class DuplicateParanthesis {
    // In this program we have to print true if duplicate paraenthesis exist 
    //if there are no duplicate parenthesis the print fales
    //(a+b)--> false
    //((a+b)) --> true

    public static boolean isDuplicateParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
           
            //closing condition
            if(ch == ')'){
                int count = 0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]){
        String str = "((a+b))";
        boolean a = isDuplicateParenthesis(str);
        System.out.println(a);
    }
}
