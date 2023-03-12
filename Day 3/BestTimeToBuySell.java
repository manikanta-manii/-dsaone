package dsaone;

public class BestTimeToBuySell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

        public static int maxProfit(int[] arr) {
            int min=arr[0];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                int diff=arr[i]-min;
                if(diff>max){
                    max=diff;
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return max;

    }
}
