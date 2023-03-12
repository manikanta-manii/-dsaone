package dsaone;

import java.util.Arrays;

public class ProductOfArrayExceptItSelf {
    public static void main(String[] args) {
         int[] nums={1,2,3,4};
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
            left[i]=nums[i]*left[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i]*right[i+1];
        }
        ans[0]=right[1];
        ans[nums.length-1]=left[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }


        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(ans));
    }

}
