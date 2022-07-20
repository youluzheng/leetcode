package cn.youluzheng.leetcode.topcode;

import java.util.HashMap;
import java.util.Map;

public class P76_2 {
    public String minWindow(String s, String t) {
        String ret = s + " ";
        if (s.length() < t.length()) {
            return "";
        }
        int sum = t.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            while (j < s.length() && sum > 0) {
                if (map.containsKey(s.charAt(j))) {
                    int value = map.get(s.charAt(j));
                    if (value > 0) {
                        sum--;
                    }
                    map.put(s.charAt(j), value - 1);
                }
                j++;
            }
            if (sum != 0) {
                break;
            }
            while (i < s.length() && sum == 0) {
                if (map.containsKey(s.charAt(i))) {
                    int value = map.get(s.charAt(i));
                    if (value == 0) {
                        sum++;
                    }
                    map.put(s.charAt(i), value + 1);
                }
                i++;
            }
            if (sum != 0) {
                ret = j - i + 1 < ret.length() ? s.substring(i - 1, j) : ret;
            }
        }
        return ret.length() > s.length() ? "" : ret;
    }

    public static void main(String[] args) {
        P76_2 p76_2 = new P76_2();
        System.out.println(p76_2.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(p76_2.minWindow("ABBBBBCA", "ABC"));
        System.out.println(p76_2.minWindow("ABC", "ABC"));
        System.out.println(p76_2.minWindow("C", "ABC"));
        System.out.println(p76_2.minWindow("AABC", "ABC"));
    }
}
