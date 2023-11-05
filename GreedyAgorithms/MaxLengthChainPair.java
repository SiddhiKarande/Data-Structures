import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPair {
    public static void main(String args[]){
        //given array
        
        int pairs[][] = {{5	,24},{39,60},{5,28},{27,40},{50,90}};
        //sort the array with column 1(I.e. ending length)
        Arrays.sort(pairs , Comparator.comparingDouble(o->o[1]));
        //considering first pair as default
        int chainLen = 1;
        int chainEnd = pairs[0][1];        
        //comapre the end of last selected pair and starting time of current pair
          // and then decide wheather to select it or not
        for(int i=1; i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);

    }
}
