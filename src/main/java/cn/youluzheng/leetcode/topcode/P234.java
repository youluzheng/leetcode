package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P234 {
    ListNode revert(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = null;
        ListNode q = head;
        while (q != null) {
            ListNode temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        return p;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        fast = fast.next;
        fast = fast.next;
        if (fast.next != null) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        slow.next = revert(slow.next);
        ListNode start = head;
        slow = slow.next;
        while (start != null && slow != null) {
            if (start.val != slow.val) {
                return false;
            }
            start = start.next;
            slow = slow.next;
        }
        return true;
    }
}
