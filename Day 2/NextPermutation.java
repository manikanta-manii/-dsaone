import java.sql.SQLOutput;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={5,4,7,5,3,2};
        //int[] ans=new int[3];
        int s=0,e=0;

                for (int i = arr.length - 2; i >= 0; i--) {
                    if (arr[i] < arr[i + 1]) {
                        s = i;
                        break;
                    }
                }

                for (int i = arr.length - 1; i >= 0; --i) {
                    if (arr[i] > arr[s]) {
                        e = i;
                        break;
                    }
                }
                // System.out.println(arr[e]);
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                // System.out.println(Arrays.toString(arr));
                int j = arr.length - 1;
                s = s + 1;
                while (s < j) {
                    int temp1 = arr[s];
                    arr[s] = arr[j];
                    arr[j] = temp1;
                    --j;
                    s++;
                }
                System.out.println(Arrays.toString(arr));



    }
}
