import java.util.Stack;

public class ReverseString {

    public static String reverseStr(String str){
          Stack<Character> s = new Stack<>();
          int idx = 0;
          while(idx < str.length()){
            s.push(str.charAt(idx));
            idx ++;
          }
          StringBuilder revStr = new StringBuilder("");
          while(!s.isEmpty()){
            char curr = s.pop();
            revStr.append(curr);
          }
          return revStr.toString();
    }
    public static void main(String args[]){
        System.out.println(reverseStr("Hello"));

    }
}
