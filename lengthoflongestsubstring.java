import java.util.*;

public class lengthoflongestsubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";

        System.out.println("Input: \"" + s1 + "\" -> Output: " + sol.lengthOfLongestSubstring(s1));
        System.out.println("Input: \"" + s2 + "\" -> Output: " + sol.lengthOfLongestSubstring(s2));
        System.out.println("Input: \"" + s3 + "\" -> Output: " + sol.lengthOfLongestSubstring(s3));
        System.out.println("Input: \"" + s4 + "\" -> Output: " + sol.lengthOfLongestSubstring(s4));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; // ASCII chars
        Arrays.fill(index, -1);
        int maxLen = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (index[c] >= left) {
                left = index[c] + 1;
            }
            index[c] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}