package cn.youluzheng.leetcode.栈与队列;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P239Test {

    static Stream<Arguments> generateNums() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3, new int[]{3, 3, 5, 5, 6, 7}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("generateNums")
    void maxSlidingWindow(int[] nums, int k, int[] expected) {
        int[] actual = P239.maxSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }
}