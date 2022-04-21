package cn.youluzheng.leetcode.topcode;

import java.util.HashMap;
import java.util.Map;

public class P2_3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        int i = -1, j = 0;
        while (i < s.length()) {
            i++;
            while (count == 0 && i < s.length()) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                if (map.get(s.charAt(i)) == 2) {
                    count++;
                    break;
                }
                i++;
            }
            max = Math.max(max, i - j);
            while (count != 0 && j < i) {
                int value = map.get(s.charAt(j));
                map.put(s.charAt(j), value - 1);
                if (value == 2) {
                    count--;
                }
                j++;
            }
        }
        return max;
    }
}
