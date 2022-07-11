package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode q = head;
        ListNode p = head.next;
        while (p != null) {
            if (p.val != q.val) {
                q.next = p;
                q = p;
            }
            p = p.next;
        }
        q.next = null;
        return head;
    }
}
