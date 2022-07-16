package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P92_2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead = new ListNode(-1, head);
        ListNode q = newHead;
        ListNode start = q;
        int i = 0;
        while (i < left) {
            i++;
            start = q;
            q = q.next;
        }
        ListNode p = q.next;
        while (i < right) {
            i++;
            ListNode temp = p.next;
            p.next = q;
            q = p;
            p = temp;
        }
        start.next.next = p;
        start.next = q;
        return newHead.next;
    }
}
