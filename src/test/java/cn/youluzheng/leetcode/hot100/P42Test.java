package cn.youluzheng.leetcode.hot100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P42Test {
    //
    // 1 0
    // 1 2
    @Test
    void trap() {
        int actual = new P42().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        assertEquals(6, actual);
    }
}