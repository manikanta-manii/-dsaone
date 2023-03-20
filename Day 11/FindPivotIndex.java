package dsaone;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr={-1,-1,0,1,1,0};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i];
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }
        if(right[1]==0){
            return 0;
        }

        for(int i=1;i<nums.length-1;i++){
            if(left[i-1]==right[i+1]){
                return i;
            }
        }
        if(left[nums.length-2]==0){
            return nums.length-1;
        }
        return -1;

    }

}
