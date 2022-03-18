package cn.youluzheng.leetcode.动态规划;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1049Test {

    @Test
    void lastStoneWeightII() {
        int actual = new P1049().lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1});
        assertEquals(1, actual);
    }
}