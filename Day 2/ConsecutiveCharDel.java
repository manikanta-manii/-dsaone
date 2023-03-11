package dsaone;

public class ConsecutiveCharDel {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveCharacter("abba"));
    }
    public static String removeConsecutiveCharacter(String S){
        String str="";
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                str=str+S.charAt(i-1);
            }
        }
        return str+S.charAt(S.length()-1);

    }
}
