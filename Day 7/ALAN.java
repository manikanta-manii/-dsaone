import java.util.Scanner;

public class ALAN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            String str=sc.nextLine();
            String str2=str.substring(str.length()-1,str.length());
            for(int i=0;i<str.length()-1;i++){
                str2=str2+str.charAt(i);
            }
             System.out.println(str2);
            StringBuilder sb=new StringBuilder(str2);
        System.out.println(sb);
            String str3=new String(sb.reverse());
        System.out.println(str3);
            if(str2.equals(str3)){
                System.out.println("Yes");
            }else{ System.out.println("No");}



    }
}
