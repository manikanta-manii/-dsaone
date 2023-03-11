package dsaone;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mdsjhda"));
    }
    public static boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        String s2=s1.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb=new StringBuilder(s2);
        sb.reverse();

        if(s2.equals(new String(sb))){
            return true;
        }
        return false;
    }

}
