package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode new_head = new ListNode(-1, head);
        ListNode q = new_head;
        ListNode p = head;
        for (int i = 1; i < left; i++) {
            q = p;
            p = p.next;
        }
        ListNode start = p;
        ListNode p2 = p.next;
        for (int i = left; i < right; i++) {
            ListNode temp = p2.next;
            p2.next = p;
            p = p2;
            p2 = temp;
        }
        q.next = p;
        start.next = p2;
        return new_head.next;
    }
}
