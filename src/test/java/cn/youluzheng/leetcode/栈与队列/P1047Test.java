package cn.youluzheng.leetcode.栈与队列;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1047Test {

    @ParameterizedTest
    @CsvSource({"aabbcc, ", "abba, ", "abcba, abcba"})
    void removeDuplicates(String input, String expected) {
        if (expected == null) {
            expected = "";
        }
        String actual = P1047.removeDuplicates(input);
        assertEquals(expected, actual);
    }
}