package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.ListNode;

public class P141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != slow) {
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
