package cn.youluzheng.leetcode.竞赛.n285;

import org.junit.jupiter.api.Test;

class P6029Test {

    @Test
    void maximumBobPoints() {
        int numArrows = 9;
        int[] aliceArrows = new int[]{1, 1, 0, 1, 0, 0, 2, 1, 0, 1, 2, 0};
        int[] actual = new P6029().maximumBobPoints(numArrows, aliceArrows);
    }
}