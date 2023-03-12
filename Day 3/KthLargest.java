package dsaone;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
