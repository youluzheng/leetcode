package cn.youluzheng.leetcode.hot100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P32Test {

    @Test
    void longestValidParentheses() {
        int actual = new P32().longestValidParentheses("((()))())");
        assertEquals(8, actual);
    }
}