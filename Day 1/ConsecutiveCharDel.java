package dsaone;

public class ConsecutiveCharDel {
    public static void main(String[] args) {
        String S="bcdebeaec";
        String str="";
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                str=str+S.charAt(i-1);
            }
        }
        System.out.println(str+S.charAt(S.length()-1));
    }
}
