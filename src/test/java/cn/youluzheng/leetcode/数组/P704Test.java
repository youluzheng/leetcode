package cn.youluzheng.leetcode.数组;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P704Test {

    @Test
    void search() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int actual = P704.search(nums, target);
        assertEquals(4, actual);
    }

    @Test
    void search2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int actual = P704.search(nums, target);
        assertEquals(-1, actual);
    }
}