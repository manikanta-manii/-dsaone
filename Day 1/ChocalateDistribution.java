package dsaone;

import java.util.Arrays;

public class ChocalateDistribution {
    public static void main(String[] args) {
        int[] arr={7, 3, 2, 4, 9, 12, 56};
        int k=3;
        Arrays.sort(arr);
        int y=k-1;
        int min=Integer.MAX_VALUE;
        int cur=0;
        for(int i=0;i<arr.length-k+1;i++){
            cur=arr[y]-arr[i];
            if(min>cur){
                min=cur;
            }
            y++;
        }
        System.out.println(min);
    }
}
