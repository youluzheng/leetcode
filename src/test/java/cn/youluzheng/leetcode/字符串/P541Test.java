package cn.youluzheng.leetcode.字符串;

import org.junit.jupiter.api.Test;

class P541Test {

    @Test
    void reverseStr() {
        String s = "abcdefg";
        int k = 2;
        String actual = P541.reverseStr(s, k);
        System.out.println(actual);
    }

    @Test
    void reverseStr2() {
        String s = "abcd";
        int k = 2;
        String actual = P541.reverseStr(s, k);
        System.out.println(actual);
    }
}