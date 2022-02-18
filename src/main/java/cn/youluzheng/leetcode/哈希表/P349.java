package cn.youluzheng.leetcode.哈希表;

import java.util.HashSet;
import java.util.Set;

public class P349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int var : nums1) {
            set.add(var);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int var : nums2) {
            if (set.contains(var)) {
                set2.add(var);
            }
        }
        int[] ret = new int[set2.size()];
        int index = 0;
        for (int var : set2) {
            ret[index++] = var;
        }
        return ret;
    }
}
