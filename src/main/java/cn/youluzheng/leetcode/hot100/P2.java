package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.ListNode;

public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode();
        ListNode q = head;
        boolean ac = false;
        while (p1 != null && p2 != null) {
            int extra = ac ? 1 : 0;
            ac = p1.val + p2.val + extra > 9;
            q.next = new ListNode((p1.val + p2.val + extra) % 10);
            q = q.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1 != null) {
            p2 = p1;
        }
        while (p2 != null) {
            int extra = ac ? 1 : 0;
            ac = p2.val + extra > 9;
            q.next = new ListNode((p2.val + extra) % 10);
            q = q.next;
            p2 = p2.next;
        }
        if (ac) {
            q.next = new ListNode(1);
        }
        return head.next;
    }
}
