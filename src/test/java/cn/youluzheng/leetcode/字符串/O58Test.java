package cn.youluzheng.leetcode.字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O58Test {

    @Test
    void reverseLeftWords() {
        String s = "abcdefg";
        int n = 2;
        String actual = O58.reverseLeftWords(s, n);
        assertEquals("cdefgab", actual);
    }
}