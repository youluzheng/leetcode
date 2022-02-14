package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

class P160Test {

    @Test
    void getIntersectionNode() {
        ListNode c3 = new ListNode(33, null);
        ListNode c2 = new ListNode(32, c3);
        ListNode c1 = new ListNode(31, c2);
        ListNode a2 = new ListNode(12, c1);
        ListNode a1 = new ListNode(11, a2);
        ListNode b3 = new ListNode(23, c1);
        ListNode b2 = new ListNode(22, b3);
        ListNode b1 = new ListNode(21, b2);
        ListNode actual = P160.getIntersectionNode(a1, b1);
        PrintUtil.print(actual);
    }

    @Test
    void getIntersectionNode2() {
        ListNode a3 = new ListNode(13, null);
        ListNode a2 = new ListNode(12, a3);
        ListNode a1 = new ListNode(11, a2);
        ListNode b2 = new ListNode(22, null);
        ListNode b1 = new ListNode(21, b2);
        ListNode actual = P160.getIntersectionNode(a1, b1);
        PrintUtil.print(actual);
    }

    @Test
    void getIntersectionNode3() {
        ListNode a1 = new ListNode(11, null);
        ListNode b1 = a1;
        ListNode actual = P160.getIntersectionNode(a1, b1);
        PrintUtil.print(actual);
    }

    @Test
    void getIntersectionNode_2() {
        ListNode c3 = new ListNode(5, null);
        ListNode c2 = new ListNode(4, c3);
        ListNode c1 = new ListNode(8, c2);
        ListNode a2 = new ListNode(1, c1);
        ListNode a1 = new ListNode(4, a2);
        ListNode b3 = new ListNode(1, c1);
        ListNode b2 = new ListNode(6, b3);
        ListNode b1 = new ListNode(5, b2);
        ListNode actual = P160.getIntersectionNode2(a1, b1);
        PrintUtil.print(actual);
    }

    @Test
    void getIntersectionNode2_2() {
        ListNode a3 = new ListNode(13, null);
        ListNode a2 = new ListNode(12, a3);
        ListNode a1 = new ListNode(11, a2);
        ListNode b2 = new ListNode(22, null);
        ListNode b1 = new ListNode(21, b2);
        ListNode actual = P160.getIntersectionNode2(a1, b1);
        PrintUtil.print(actual);
    }

    @Test
    void getIntersectionNode3_2() {
        ListNode a1 = new ListNode(11, null);
        ListNode b1 = a1;
        ListNode actual = P160.getIntersectionNode2(a1, b1);
        PrintUtil.print(actual);
    }
}