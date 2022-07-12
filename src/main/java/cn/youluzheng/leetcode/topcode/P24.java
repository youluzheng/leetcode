package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P24 {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0, head);
        ListNode node1 = newHead;
        ListNode node2 = node1.next;
        if (node2 == null) {
            return null;
        }
        ListNode node3 = node2.next;
        while (node3 != null) {
            node2.next = node3.next;
            node3.next = node2;
            node1.next = node3;
            node1 = node2;
            node2 = node1.next;
            if (node2 == null) {
                return newHead.next;
            }
            node3 = node2.next;
        }
        return newHead.next;
    }
}
