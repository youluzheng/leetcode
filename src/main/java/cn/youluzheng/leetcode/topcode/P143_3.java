package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P143_3 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            slow = slow.next;
        }
        ListNode pre = null;
        ListNode next = slow.next;
        slow.next = null;
        while (next != null) {
            ListNode temp = next.next;
            next.next = pre;
            pre = next;
            next = temp;
        }
        slow = head;
        fast = pre;
        while (fast != null) {
            ListNode slowTemp = slow.next;
            ListNode fastTemp = fast.next;
            slow.next = fast;
            fast.next = slowTemp;
            slow = slowTemp;
            fast = fastTemp;
        }
    }
}
