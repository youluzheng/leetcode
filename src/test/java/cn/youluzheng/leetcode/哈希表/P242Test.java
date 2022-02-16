package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P242Test {

    @Test
    void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        boolean actual = P242.isAnagram(s, t);
        assertTrue(actual);
    }

    @Test
    void isAnagram2() {
        String s = "rat";
        String t = "cat";
        boolean actual = P242.isAnagram(s, t);
        assertFalse(actual);
    }
}