package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P143 {
    ListNode reverse(ListNode first, ListNode second) {
        if (second == null) {
            return first;
        }
        ListNode next = second.next;
        second.next = first;
        return reverse(second, next);
    }

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        ListNode l1 = head.next;
        ListNode l2 = reverse(null, slow.next);
        slow.next = null;
        ListNode p = head;
        while (l1 != null || l2 != null) {
            if (l2 != null) {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }
            if (l1 != null) {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            }
        }
    }
}
