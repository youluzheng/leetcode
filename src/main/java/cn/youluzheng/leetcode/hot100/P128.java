package cn.youluzheng.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

public class P128 {

    int findFather(Map<Integer, Integer> map, int i) {
        while (map.get(i) != Integer.MAX_VALUE) {
            i = map.get(i);
        }
        return i;
    }

    void changeFather(Map<Integer, Integer> map, int i, int newFather) {
        while (map.get(i) != Integer.MAX_VALUE) {
            int temp = i;
            i = map.get(i);
            map.put(temp, newFather);
        }
        map.put(i, newFather);
    }

    public int longestConsecutive(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                continue;
            }
            if (map.containsKey(n - 1)) {
                changeFather(map, n - 1, n);
            }
            if (map.containsKey(n + 1)) {
                changeFather(map, n + 1, n);
            }
            map.put(n, Integer.MAX_VALUE);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int n : map.keySet()) {
            int father = findFather(map, n);
            map2.put(father, map2.getOrDefault(father, 0) + 1);
        }
        for (int value : map2.values()) {
            max = Math.max(max, value);
        }
        return max;
    }
}
