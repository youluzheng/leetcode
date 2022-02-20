package cn.youluzheng.leetcode.哈希表;

import java.util.HashMap;
import java.util.Map;

public class P454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int var1 : nums1)
            for (int var2 : nums2) {
                int temp = -var1 - var2;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        for (int var1 : nums3) {
            for (int var2 : nums4) {
                if (map.containsKey(var1 + var2)) {
                    result += map.get(var1 + var2);
                }
            }
        }
        return result;
    }
}
