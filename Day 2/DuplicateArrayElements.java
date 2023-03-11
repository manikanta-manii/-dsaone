package dsaone;

public class DuplicateArrayElements {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        for(int i=0;i<arr.length;i++){
            int index=arr[i]%arr.length;
            arr[index]+= arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if((arr[i]/ arr.length)>=2){
                System.out.print(i+" ");
            }
        }
    }
}
