package cn.youluzheng.leetcode.字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P28Test {

    @Test
    void strStr() {
        int actual = P28.strStr("hello", "ll");
        assertEquals(2, actual);
    }

    @Test
    void strStr2() {
        int actual = P28.strStr("aaaaa", "bba");
        assertEquals(-1, actual);
    }

    @Test
    void strStr3() {
        int actual = P28.strStr("", "");
        assertEquals(0, actual);
    }

    @Test
    void strStr4() {
        int actual = P28.strStr("mississippi", "issip");
        assertEquals(4, actual);
    }

    @Test
    void strStr5() {
        int actual = P28.strStr("aaabaaabbbabaa", "babb");
        assertEquals(-1, actual);
    }

    @Test
    void strStr6() {
        int actual = P28.strStr("ababcaababcaabc", "ababcaabc");
        assertEquals(6, actual);
    }
}