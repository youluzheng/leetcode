package cn.youluzheng.leetcode.数组;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P209Test {

    @Test
    void minSubArrayLen() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int actual = P209.minSubArrayLen(target, nums);
        assertEquals(2, actual);
    }

    @Test
    void minSubArrayLen2() {
        int[] nums = {1, 4, 4};
        int target = 4;
        int actual = P209.minSubArrayLen(target, nums);
        assertEquals(1, actual);
    }

    @Test
    void minSubArrayLen3() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        int actual = P209.minSubArrayLen(target, nums);
        assertEquals(0, actual);
    }
}