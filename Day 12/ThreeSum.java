package dsaone;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        //System.out.println(threeSum());
    }

        public static List<List<Integer>> threeSum(int[] nums) {
            int target=0;
            Set<List<Integer>> ans=new HashSet<>();
            int n=nums.length;
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++){
                int j=i+1;
                int k=nums.length-1;

                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==target){
                        ArrayList<Integer> sp = new ArrayList<>();
                        sp.add(nums[i]);
                        sp.add(nums[j]);
                        sp.add(nums[k]);

                        ans.add(sp);
                        j++;

                    }
                    else if(sum<target){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }

            return new ArrayList<>(ans);
        }
    }

