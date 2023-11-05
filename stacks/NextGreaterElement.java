import java.util.Stack;

public class NextGreaterElement {

    
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};

        //to store next greater element in 
        int nxtGreater[] = new int[arr.length];
        
        //stack to store traveresed element
        //here basic logic is that we traverse the array in reverse order

        Stack<Integer> s = new Stack<>();

       for(int i = arr.length-1; i>=0;i--){
            //while loop 
            while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
                s.pop();
            }
            //update nxtGreater array
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] =arr[s.peek()];
            }
            //add element to stack
            s.push(i);

       }

       //to print next greater array
       for(int i=0; i<arr.length;i++){
        System.out.print(nxtGreater[i] +" ");
       }
    }
}
