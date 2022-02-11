package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.CompareUtil;
import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P203Test {

    @Test
    void removeElements() {
        List<Integer> list = List.of(1, 2, 6, 3, 4, 5, 6);
        ListNode actual = P203.removeElements(new ListNode(list), 6);
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(1, 2, 3, 4, 5), actual));
    }

    @Test
    void removeElements2() {
        ListNode actual = P203.removeElements(null, 1);
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(), actual));
    }

    @Test
    void removeElements3() {
        List<Integer> list = List.of(7, 7, 7, 7);
        ListNode actual = P203.removeElements(new ListNode(list), 7);
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(), actual));
    }
}