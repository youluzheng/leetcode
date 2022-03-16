package cn.youluzheng.leetcode.动态规划;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P343Test {

    @Test
    void integerBreak() {
        int actual = new P343().integerBreak(10);
        assertEquals(36, actual);
    }
}