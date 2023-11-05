import java.util.*;

public class Knapsack {
    public static void main(String args[]){
        int weight[] ={10,20,30};
        int value[] ={60,100,120};
        int capacity = 50;

        //finding the ratio
        //creating 2D array 
        double ratio[][] = new double[value.length][2];
        for(int i=0; i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        //sorting 2D array
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        //adding the weight to bag
        int w =capacity;
        int finalVal =0;
        for(int i=ratio.length-1; i>=0;i--){
            int idx = (int)ratio[i][1];
            if(w>=weight[idx]){
                finalVal+=value[idx];
                w -=weight[idx];

            }else{
                finalVal +=(ratio[i][1]* w);
                w = 0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
