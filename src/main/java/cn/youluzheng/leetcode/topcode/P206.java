package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode node = head;
        ListNode next = node.next;
        node.next = pre;
        while (next != null) {
            pre = node;
            node = next;
            next = next.next;
            node.next = pre;
        }
        return node;
    }

    ListNode reverse(ListNode pre, ListNode now) {
        if (now == null) {
            return pre;
        }
        ListNode next = now.next;
        now.next = pre;
        return reverse(now, next);
    }

    public ListNode reverseList2(ListNode head) {
        return reverse(null, head);
    }
}
