package cn.youluzheng.leetcode.周赛.n304;

import java.util.HashSet;
import java.util.Set;

public class P6132 {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num != 0) {
                set.add(num);
            }
        }
        return set.size();
    }
}
