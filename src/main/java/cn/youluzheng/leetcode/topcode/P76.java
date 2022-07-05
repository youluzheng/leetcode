package cn.youluzheng.leetcode.topcode;

import java.util.HashMap;
import java.util.Map;

public class P76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        int sum = t.length();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        String minStr = s + " ";
        int slow = 0, fast = 0;
        while (slow < s.length() && fast < s.length()) {
            while (sum > 0 && fast < s.length()) {
                if (map.containsKey(s.charAt(fast))) {
                    int value = map.get(s.charAt(fast));
                    if (value > 0) {
                        sum--;
                    }
                    map.put(s.charAt(fast), value - 1);
                }
                fast++;
            }
            if (sum > 0) {
                break;
            }
            while (sum == 0 && slow < s.length()) {
                if (map.containsKey(s.charAt(slow))) {
                    int value = map.get(s.charAt(slow));
                    if (value == 0) {
                        sum++;
                    }
                    map.put(s.charAt(slow), value + 1);
                }
                slow++;
            }
            if (sum == 0) {
                break;
            }
            minStr = minStr.length() > fast - slow + 1 ? s.substring(slow - 1, fast) : minStr;
        }
        return minStr.length() > s.length() ? "" : minStr;
    }

    public static void main(String[] args) {
        String str = new P76().minWindow("cabwefgewcwaefgcf", "cae");
        str = new P76().minWindow("ADOBECODEBANC", "ABC");
        System.out.println(str);
    }
}
