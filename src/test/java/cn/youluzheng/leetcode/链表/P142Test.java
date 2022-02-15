package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

class P142Test {

    @Test
    void detectCycle() {
        ListNode n4 = new ListNode(-4, null);
        ListNode n3 = new ListNode(0, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(3, n2);
        n4.next = n2;
        ListNode actual = P142.detectCycle(n1);
        PrintUtil.print(actual, 5);
    }

    @Test
    void detectCycle2() {
        ListNode n2 = new ListNode(2, null);
        ListNode n1 = new ListNode(1, n2);
        n2.next = n1;
        ListNode actual = P142.detectCycle(n1);
        PrintUtil.print(actual, 3);
    }

    @Test
    void detectCycle3() {
        ListNode n1 = new ListNode(1, null);
        n1.next = n1;
        ListNode actual = P142.detectCycle(n1);
        PrintUtil.print(actual, 2);
    }

    @Test
    void detectCycle4() {
        ListNode n1 = new ListNode(1, null);
        ListNode actual = P142.detectCycle(n1);
        PrintUtil.print(actual, 2);
    }
}