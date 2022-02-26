package cn.youluzheng.leetcode.栈与队列;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P150Test {

    static Stream<Arguments> generateTokens() {
        return Stream.of(
                Arguments.of(new String[]{"2", "1", "+", "3", "*"}, 9),
                Arguments.of(new String[]{"4", "13", "5", "/", "+"}, 6),
                Arguments.of(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, 22)
        );
    }

    @ParameterizedTest
    @MethodSource("generateTokens")
    void evalRPN(String[] tokens, int expected) {
        int actual = P150.evalRPN(tokens);
        assertEquals(expected, actual);
    }
}