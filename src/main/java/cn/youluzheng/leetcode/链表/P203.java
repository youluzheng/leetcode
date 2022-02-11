package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;

/**
 * 移除链表元素
 */
public class P203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode slow = new ListNode(-1, head);
        head = slow;
        ListNode fast = slow.next;
        while (fast != null) {
            if (fast.val == val) {
                slow.next = fast.next;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }
        return head.next;
    }
}
