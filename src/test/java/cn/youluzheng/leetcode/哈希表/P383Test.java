package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P383Test {

    @Test
    void canConstruct1() {
        String ransomNote = "a";
        String magazine = "b";
        boolean actual = P383.canConstruct(ransomNote, magazine);
        assertFalse(actual);
    }

    @Test
    void canConstruct2() {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean actual = P383.canConstruct(ransomNote, magazine);
        assertFalse(actual);
    }

    @Test
    void canConstruct3() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean actual = P383.canConstruct(ransomNote, magazine);
        assertTrue(actual);
    }

    @Test
    void canConstruct4() {
        String ransomNote = "aab";
        String magazine = "baa";
        boolean actual = P383.canConstruct(ransomNote, magazine);
        assertTrue(actual);
    }
}