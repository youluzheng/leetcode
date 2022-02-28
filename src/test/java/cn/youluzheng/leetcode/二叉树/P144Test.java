package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P144Test {

    static Stream<Arguments> generate() {
        return Stream.of(
                Arguments.of(new int[]{1, -1, 2, 3}, Arrays.asList(1, 2, 3)),
                Arguments.of(new int[]{}, List.of()),
                Arguments.of(new int[]{1}, List.of(1))
        );
    }

    @ParameterizedTest
    @MethodSource("generate")
    void preorderTraversal(int[] nums, List<Integer> expected) {
        List<Integer> actual = P144.preorderTraversal(nums.length == 0 ? null : new TreeNode(nums));
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("generate")
    void preorderTraversal2(int[] nums, List<Integer> expected) {
        List<Integer> actual = P144.preorderTraversal2(nums.length == 0 ? null : new TreeNode(nums));
        assertEquals(expected, actual);
    }
}