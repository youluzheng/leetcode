package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

class P19Test {

    @Test
    void removeNthFromEnd() {
        ListNode actual = P19.removeNthFromEnd(new ListNode(List.of(1, 2, 3, 4, 5)), 2);
        PrintUtil.print(actual);
    }

    @Test
    void removeNthFromEnd2() {
        ListNode actual = P19.removeNthFromEnd(new ListNode(List.of(1)), 1);
        PrintUtil.print(actual);
    }

    @Test
    void removeNthFromEnd3() {
        ListNode actual = P19.removeNthFromEnd(new ListNode(List.of(1, 2)), 1);
        PrintUtil.print(actual);
    }

    @Test
    void removeNthFromEnd_2() {
        ListNode actual = P19.removeNthFromEnd2(new ListNode(List.of(1, 2, 3, 4, 5)), 2);
        PrintUtil.print(actual);
    }

    @Test
    void removeNthFromEnd2_2() {
        ListNode actual = P19.removeNthFromEnd2(new ListNode(List.of(1)), 1);
        PrintUtil.print(actual);
    }

    @Test
    void removeNthFromEnd3_2() {
        ListNode actual = P19.removeNthFromEnd2(new ListNode(List.of(1, 2)), 1);
        PrintUtil.print(actual);
    }
}