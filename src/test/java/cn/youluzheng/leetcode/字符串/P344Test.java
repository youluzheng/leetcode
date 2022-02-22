package cn.youluzheng.leetcode.字符串;

import org.junit.jupiter.api.Test;

class P344Test {

    @Test
    void reverseString() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        P344.reverseString(s);
        System.out.println(s);
    }

    @Test
    void reverseString2() {
        char[] s = {};
        P344.reverseString(s);
        System.out.println(s);
    }


    @Test
    void reverseString3() {
        char[] s = {'a', 'b'};
        P344.reverseString(s);
        System.out.println(s);
    }
}