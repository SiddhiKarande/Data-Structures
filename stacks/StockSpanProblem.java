import java.util.Stack;

public class StockSpanProblem {


    public static void main(String args[]){
        int arr[]={100,80,60,70,60,85,100};
        int span[]=new int[arr.length];

        Stack<Integer> s = new Stack<>();

        //to cal culate span
        s.push(0);
        span[0]=1;
            
        for(int i=1 ;i<arr.length ;i++){
            int currStock = arr[i];
            //prev high
            while(!s.isEmpty() && currStock> arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }

    }
}
