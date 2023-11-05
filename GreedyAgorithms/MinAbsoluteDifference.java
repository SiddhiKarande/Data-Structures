import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String args[]){
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        //sort
        Arrays.sort(A);
        Arrays.sort(B);

        //declare the minSum variable
        int minSum = 0;
        //calculate minSum
        for(int i=0; i<A.length;i++){
            minSum += Math.abs(A[i]-B[i]);
        }
        System.out.println(minSum);

    }
}
