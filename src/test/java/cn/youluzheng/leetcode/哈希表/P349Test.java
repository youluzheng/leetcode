package cn.youluzheng.leetcode.哈希表;

import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

class P349Test {

    @Test
    void intersection() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] actual = P349.intersection(nums1, nums2);
        PrintUtil.print(actual);
    }

    @Test
    void intersection2() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] actual = P349.intersection(nums1, nums2);
        PrintUtil.print(actual);
    }
}