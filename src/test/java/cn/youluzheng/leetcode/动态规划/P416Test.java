package cn.youluzheng.leetcode.动态规划;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P416Test {

    @Test
    void canPartition() {
        boolean actual = new P416().canPartition(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertTrue(actual);
    }
}