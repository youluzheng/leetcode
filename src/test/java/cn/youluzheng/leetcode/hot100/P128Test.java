package cn.youluzheng.leetcode.hot100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P128Test {

    @Test
    void longestConsecutive() {
        int actual = new P128().longestConsecutive(new int[]{-4, -1, 4, -5, 1, -6, 9, -6, 0, 2, 2, 7, 0, 9, -3, 8, 9, -2, -6, 5, 0, 3, 4, -2});
        assertEquals(12, actual);
    }
}