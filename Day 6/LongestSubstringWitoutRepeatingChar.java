package dsaone;

import java.util.HashSet;

public class LongestSubstringWitoutRepeatingChar {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();

        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                max = Math.max(hs.size(), max);
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
