package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.CompareUtil;
import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P206Test {

    @Test
    void reverseList() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListNode actual = P206.reverseList(new ListNode(list));
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(5, 4, 3, 2, 1), actual));
    }

    @Test
    void reverseList2() {
        ListNode actual = P206.reverseList(null);
        assertTrue(CompareUtil.isEqual(List.of(), actual));
    }

    @Test
    void reverseList3() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListNode actual = P206.reverseList2(new ListNode(list));
        PrintUtil.print(actual);
        assertTrue(CompareUtil.isEqual(List.of(5, 4, 3, 2, 1), actual));
    }

    @Test
    void reverseList4() {
        ListNode actual = P206.reverseList2(null);
        assertTrue(CompareUtil.isEqual(List.of(), actual));
    }
}