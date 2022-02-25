package cn.youluzheng.leetcode.字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P459Test {

    @Test
    void repeatedSubstringPattern() {
        boolean actual = P459.repeatedSubstringPattern("ababab");
        assertTrue(actual);
    }

    @Test
    void repeatedSubstringPattern2() {
        boolean actual = P459.repeatedSubstringPattern("abababa");
        assertFalse(actual);
    }

    @Test
    void repeatedSubstringPattern_2() {
        boolean actual = P459.repeatedSubstringPattern2("ababab");
        assertTrue(actual);
    }

    @Test
    void repeatedSubstringPattern2_2() {
        boolean actual = P459.repeatedSubstringPattern2("abababa");
        assertFalse(actual);
    }
}