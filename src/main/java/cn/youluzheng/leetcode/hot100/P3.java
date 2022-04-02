package cn.youluzheng.leetcode.hot100;

import java.util.HashSet;
import java.util.Set;

public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        int slow = 0;
        int fast = 0;
        for (; fast < s.length(); fast++) {
            while (set.contains(s.charAt(fast)) && slow < fast) {
                set.remove(s.charAt(slow++));
            }
            set.add(s.charAt(fast));
            max = Math.max(max, fast - slow + 1);
        }
        return max;
    }
}
