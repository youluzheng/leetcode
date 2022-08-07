package cn.youluzheng.leetcode.niuke.mihayou;

import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 1;
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            while (j < s.length()) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, j - i);
            if (j == s.length()) {
                break;
            }
            while (i < j) {
                set.remove(s.charAt(i));
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    break;
                }
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
