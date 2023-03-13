package dsaone;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int maxarea=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int min=Math.min(arr[i],arr[j]);
                int area=(j-i)*min;
                if(area>maxarea){
                    maxarea=area;
                }
            }
        }
        System.out.println(maxarea);
    }
}
