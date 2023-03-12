package dsaone;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        /* MIGHT COZ OVERFLOW , INT->LONG */
        /* 0-N , 1-N ,1->N-1, WORKS */
        int n=nums.length;
        int sum1=(n*(n+1))>>1;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2=sum2+nums[i];
        }
        return Math.abs(sum1-sum2);
    }
}
