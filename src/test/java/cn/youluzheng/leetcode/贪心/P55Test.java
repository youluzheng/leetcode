package cn.youluzheng.leetcode.贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P55Test {

    @Test
    void canJump() {
        boolean actual = new P55().canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0});
        assertTrue(actual);
    }
}