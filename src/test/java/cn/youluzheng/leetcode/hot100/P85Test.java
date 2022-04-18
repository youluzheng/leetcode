package cn.youluzheng.leetcode.hot100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P85Test {

    @Test
    void maximalRectangle() {
        int actual = new P85().maximalRectangle(new char[][]{{'0', '0', '1'}, {'1', '1', '1'}});
        assertEquals(3, actual);
    }
}