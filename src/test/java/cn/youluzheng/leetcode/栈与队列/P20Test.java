package cn.youluzheng.leetcode.栈与队列;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P20Test {

    @ParameterizedTest
    @ValueSource(strings = {"()", "{}", "[]", "([])"})
    void isValid_true(String s) {
        boolean actual = P20.isValid(s);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"([)]", "{", "{{]]", "(())]"})
    void isValid_false(String s) {
        boolean actual = P20.isValid(s);
        assertFalse(actual);
    }

}