package cn.youluzheng.leetcode.周赛.n290;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class P6041 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int j = 0; j < nums[0].length; j++) {
            map.put(nums[0][j], 1);
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (map.containsKey(nums[i][j])) {
                    if (map.get(nums[i][j]) == i) {
                        map.put(nums[i][j], i + 1);
                    }
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                result.add(key);
            }
        }
        return result;
    }
}
