package cn.youluzheng.leetcode.贪心;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P135Test {

    static Stream<Arguments> generate() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 4}, 4),
                Arguments.of(new int[]{3, 3, 3}, 3),
                Arguments.of(new int[]{3, 3, 3, 2}, 5),
                Arguments.of(new int[]{3, 3, 3, 3}, 4),
                Arguments.of(new int[]{1, 2, 87, 87, 87, 2, 1}, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("generate")
    void candy(int[] nums, int expected) {
        int actual = new P135().candy(nums);
        assertEquals(expected, actual);
    }
}