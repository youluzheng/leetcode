package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P454Test {

    @Test
    void fourSumCount() {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        int actual = P454.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(2, actual);
    }

    @Test
    void fourSumCount2() {
        int[] nums1 = {0};
        int[] nums2 = {0};
        int[] nums3 = {0};
        int[] nums4 = {0};
        int actual = P454.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(1, actual);
    }

    @Test
    void fourSumCount3() {
        int[] nums1 = {-1, -1};
        int[] nums2 = {-1, 1};
        int[] nums3 = {-1, 1};
        int[] nums4 = {1, -1};
        int actual = P454.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(6, actual);
    }
}