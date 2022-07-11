package cn.youluzheng.leetcode.topcode;

import java.util.HashSet;
import java.util.Set;

public class P128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        Set<Integer> set2 = new HashSet<>(nums.length);
        for (int n : nums) {
            if (!set.contains(n)) {
                set2.remove(n + 1);
                if (!set.contains(n - 1)) {
                    set2.add(n);
                }
            }
            set.add(n);
        }
        int max = 0;
        for (int n : set2) {
            int count = 0;
            while (set.contains(n)) {
                n++;
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
