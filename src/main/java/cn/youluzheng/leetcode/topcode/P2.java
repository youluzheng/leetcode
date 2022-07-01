package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int inc = 0;
        ListNode head = new ListNode();
        ListNode n = head;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + inc;
            n.next = new ListNode(sum % 10);
            n = n.next;
            inc = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            l1 = l2;
        }
        while (l1 != null) {
            int sum = l1.val + inc;
            n.next = new ListNode(sum % 10);
            n = n.next;
            inc = sum / 10;
            l1 = l1.next;
        }
        if (inc == 1) {
            n.next = new ListNode(1);
        }
        return head.next;
    }
}
