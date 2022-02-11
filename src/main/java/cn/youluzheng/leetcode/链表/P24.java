package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;

/**
 * 两两交换链表中的节点
 */
public class P24 {
    public static ListNode swapPairs(ListNode head) {
        // 虚拟头节点
        head = new ListNode(-1, head);

        ListNode pre = head;
        ListNode cur = head;
        ListNode temp = head;

        while (pre.next != null && pre.next.next != null) {
            pre = pre.next;
            cur = pre.next;

            pre.next = cur.next;
            cur.next = pre;
            temp.next = cur;
            temp = pre;
        }
        return head.next;
    }

    public static ListNode swapPairs2(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head.next;

        head.next = cur.next;
        cur.next = head;
        head.next = swapPairs2(head.next);
        return cur;
    }
}
