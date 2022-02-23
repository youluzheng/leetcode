package cn.youluzheng.leetcode.字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P151Test {

    @Test
    void reverseWords() {
        String s = "the sky is blue";
        String actual = P151.reverseWords(s);
        System.out.println(actual);
        assertEquals("blue is sky the", actual);
    }

    @Test
    void reverseWords2() {
        String s = "  the sky   is blue  ";
        String actual = P151.reverseWords(s);
        System.out.println(actual);
        assertEquals("blue is sky the", actual);
    }
}