import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class ninja {
    public static void main(String[] args) throws IOException {

//        int[] arr={1,2,3};
//        String str="";
//        for (int i = 0; i <arr.length ; i++) {
//            str=str+arr[i];
//        }
//        System.out.println(str);
        
        
//        int n=13;
//        double d=(1+Math.sqrt(5))/2;
//        int ans=(int)Math.round(Math.pow(d,n)/Math.sqrt(5));
//        System.out.println(ans);
        
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <1 ; j++) {
                System.out.println("j");
                break;
            }
            System.out.println("i");
        }


//        for (long i = 1; i <= 100; i++) {
//            if(checkprime(i))
//            System.out.println(i);
//        }
        
        
//        int max=Integer.MAX_VALUE;
//        int n=3;
//        n=n<<3;  2 pow 3
//        System.out.println(max);
//        System.out.println(n);
//        int sum=10*(11)>>1;
        
         
//        int num=12342222,num2=0;
//        num=(int)(Math.log10(num))+1; /* number of digits in a number */
//        System.out.println(num);
       // System.out.println(gcd(12,16));
//      //  System.out.println(checkPowOf2(8));
//       for(char i=97;i<(97+26);i++)
//          // System.out.println(i);
//        System.out.println(i&31);
        //System.out.println();
        //toBinarya(5);
//          float f=123.445f;
//          //System.out.format("%.2f",f);
//        int[] arr={4,5,45,4,54565,5,4,45,45,45,5,4};

        //Arrays.sort(arr);
        //Arrays.binary



       // System.out.println( Arrays.binarySearch(arr,1));


//        HashMap<Integer,Integer> hm=new HashMap<>();
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        float f=sc.nextFloat();
      //  Double d=sc.next
    }
    public static boolean checkprime(long num){
       return BigInteger.valueOf(num).isProbablePrime(1);

    }
    public static int gcd(int a, int b){
        BigInteger b1=BigInteger.valueOf(a);
        BigInteger b2=BigInteger.valueOf(b);

        BigInteger gcd=b1.gcd(b2);
        return gcd.intValue();
    }
    public static boolean checkPowOf2(int num){
        return num!=0 && ((num &(num-1))==0);
    }
    public static void toBinarya(int a){
        String strA=Integer.toString(a,2);
        System.out.println(strA);
    }
    /* BInary to innt */;
    public String addBinary(String a, String b) {
        int x=Integer.parseInt(a,2);  
        int y=Integer.parseInt(b,2);  
        x=x+y;
        return Integer.toString(x,2);
    }
}
