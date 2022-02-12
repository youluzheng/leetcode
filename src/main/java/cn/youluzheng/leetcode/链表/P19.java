package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除链表中的倒数低N个结点
 */
public class P19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        head = new ListNode(-1, head);
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        list.get(list.size() - n - 1).next = list.get(list.size() - n).next;
        return list.get(0).next;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        head = new ListNode(-1, head);
        ListNode slow = head;
        ListNode fast = head;

        while (n != 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }
}
