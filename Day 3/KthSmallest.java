package dsaone;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        System.out.println(findKthsmallest(arr,2));
    }
    public static int findKthsmallest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k-1];
    }
}
