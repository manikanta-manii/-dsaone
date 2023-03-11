package dsaone;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

        public static boolean isAnagram(String s, String t) {
            char[] arr=s.toCharArray();
            char[] arr2=t.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr2);
            if(Arrays.equals(arr,arr2)){
                return true;
            }
            return false;


    }
}
