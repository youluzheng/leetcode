package cn.youluzheng.leetcode.栈与队列;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P347Test {

    static Stream<Arguments> generate() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{1}, 1, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("generate")
    void topKFrequent(int[] nums, int k, int[] expected) {
        int[] actual = P347.topKFrequent(nums, k);
        assertArrayEquals(expected, actual);
    }
}