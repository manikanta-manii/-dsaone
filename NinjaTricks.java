package dsaone;

import java.math.BigInteger;

public class NinjaTricks {
    public static void main(String[] args) {
        /*BigInteger the Lifesaver*/
        BigInteger b1=new BigInteger("3");
        BigInteger b2=new BigInteger("11");
        BigInteger b3=b1.add(b2);System.out.println(b3);

       ///*(Ans * a) % b is 1  */ -->  Mod Inverse , b1.modInverse(b2) gives ans;  */

       /* convert binary to integer*/
       String a="11";
       int x=Integer.parseInt(a,2);
        System.out.println(x);

        /* convert Integer to Binary*/
        int y=2;
        String b=Integer.toString(y,2);
        System.out.println(b);

        /* Checking Prime or not */
        System.out.println(BigInteger.valueOf(12).nextProbablePrime());

        /* Getting NextProbable Prime */
        System.out.println(BigInteger.valueOf(12).isProbablePrime(1));

        /* FIBONACCI SERIES FORMULA */
        int N=5;
        double d=(1+Math.sqrt(5))/2;
        int ans=(int)Math.round((Math.pow(d,N))/Math.sqrt(5));
        System.out.println(ans);
    }
    public static void factorial(int n){
          BigInteger result=BigInteger.ONE;
          for(int i=2;i<=n;i++){
              result=result.multiply(BigInteger.valueOf(i));
          }
          System.out.println(result);
    }
    public static void factorial1(long n){
         long result=1;
        for(long i=2;i<=n;i++){
            result=result*(i);
        }
        System.out.println(result);
    }
}
