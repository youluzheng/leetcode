package cn.youluzheng.leetcode.哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 */
public class P242 {
    public static boolean isAnagram(String s, String t) {
        Map<Integer, Integer> map = new HashMap<>();
        s.chars().forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));
        boolean result = t.chars().anyMatch(x -> {
            if (!map.containsKey(x)) {
                return true;
            }
            map.put(x, map.get(x) - 1);
            return false;
        });
        if (result) {
            return false;
        }
        return map.values().stream().noneMatch(x -> x != 0);
    }
}
