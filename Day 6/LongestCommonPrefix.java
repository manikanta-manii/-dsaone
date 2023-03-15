package dsaone;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    } public static String longestCommonPrefix(String[] arr) {
        if(arr.length == 0) return "";
        String ans=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(ans)!=0){
               // System.out.println(arr[i].indexOf(ans));
                ans=ans.substring(0,ans.length()-1);
            }
        }
        return ans;
    }
}
