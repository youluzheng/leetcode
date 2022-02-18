package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P202Test {

    @ParameterizedTest
    @CsvSource({"1, true", "2, false", "7, true", "8, false", "25, false", "100, true"})
    void isHappy(int n, boolean expected) {
        boolean actual = P202.isHappy(n);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"25, false"})
    void isHappy1(int n, boolean expected) {
        boolean actual = P202.isHappy(n);
        assertEquals(expected, actual);
    }
}