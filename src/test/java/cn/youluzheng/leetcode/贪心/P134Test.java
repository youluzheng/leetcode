package cn.youluzheng.leetcode.贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P134Test {

    @Test
    void canCompleteCircuit() {
        int actual = new P134().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        assertEquals(3, actual);
    }

    @Test
    void canCompleteCircuit2() {
        int actual = new P134().canCompleteCircuit(new int[]{3, 3, 4}, new int[]{3, 4, 4});
        assertEquals(-1, actual);
    }
}