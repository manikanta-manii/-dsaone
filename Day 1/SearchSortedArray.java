package dsaone;

public class SearchSortedArray {

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=9;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)>>1;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println(-1);
        return;
    }

}
