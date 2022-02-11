package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.CompareUtil;
import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P24Test {

    @Test
    void swapPairs() {
        List<Integer> list = List.of(1, 2, 3, 4);
        ListNode actual = P24.swapPairs(new ListNode(list));
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(2, 1, 4, 3), actual));
    }

    @Test
    void swapPairs2() {
        ListNode actual = P24.swapPairs(null);
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(), actual));
    }

    @Test
    void swapPairs3() {
        ListNode actual = P24.swapPairs(new ListNode(List.of(1)));
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(1), actual));
    }

    @Test
    void swapPairs4() {
        List<Integer> list = List.of(1, 2, 3, 4);
        ListNode actual = P24.swapPairs2(new ListNode(list));
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(2, 1, 4, 3), actual));
    }

    @Test
    void swapPairs5() {
        ListNode actual = P24.swapPairs2(null);
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(), actual));
    }

    @Test
    void swapPairs6() {
        ListNode actual = P24.swapPairs2(new ListNode(List.of(1)));
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(1), actual));
    }
}