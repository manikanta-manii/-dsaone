package dsaone;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int[] ans=new int[arr.length];
        left[0]=arr[0];
        int max1=left[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(arr[i],max1);
            max1=left[i];
        }
        right[arr.length-1]=arr[arr.length-1];
        max1=right[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(arr[i],max1);
            max1=right[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for(int i=0;i<arr.length;i++){
            ans[i]=Math.min(left[i],right[i])-arr[i];
        }
       // return Arrays.stream(arr).sum();
        System.out.println(Arrays.toString(ans));
    }
}
