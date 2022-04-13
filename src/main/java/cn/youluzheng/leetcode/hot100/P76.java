package cn.youluzheng.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

public class P76 {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            sum++;
        }
        int i = 0;
        while (i < s.length() && !map.containsKey(s.charAt(i))) {
            i++;
        }
        String result = null;
        int left = i;
        int right = i + 1;
        for (; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value - 1);
                if (value > 0) {
                    sum--;
                }
                if (sum == 0) {
                    right = i + 1;
                    result = s.substring(left, right);
                    break;
                }
            }
        }
        if (result == null) {
            return "";
        }
        while (right <= s.length()) {
            int value = map.get(s.charAt(left));
            map.put(s.charAt(left), value + 1);
            if (value >= 0) {
                sum++;
            }
            left++;
            while (left < right) {
                if (map.containsKey(s.charAt(left))) {
                    break;
                }
                left++;
            }
            if (sum == 0) {
                if (right - left < result.length()) {
                    result = s.substring(left, right);
                }
                continue;
            }
            right++;
            while (right <= s.length()) {
                if (map.containsKey(s.charAt(right - 1))) {
                    value = map.get(s.charAt(right - 1));
                    map.put(s.charAt(right - 1), value - 1);
                    if (value > 0) {
                        sum--;
                    }
                    if (sum == 0) {
                        if (right - left < result.length()) {
                            result = s.substring(left, right);
                        }
                        break;
                    }
                }
                right++;
            }
        }
        return result;
    }
}
