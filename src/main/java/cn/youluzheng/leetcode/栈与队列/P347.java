package cn.youluzheng.leetcode.栈与队列;

import java.util.HashMap;
import java.util.Map;

public class P347 {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int var : nums) {
            map.put(var, map.getOrDefault(var, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int key = 0;
            int value = -1;
            for (int var : map.keySet()) {
                if (map.get(var) > value) {
                    key = var;
                    value = map.get(var);
                }
            }
            map.remove(key);
            result[i] = key;
        }
        return result;
    }
}
