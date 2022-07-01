package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P148 {

    ListNode merge(ListNode node1, ListNode node2) {
        ListNode head = new ListNode();
        ListNode n = head;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                n.next = node1;
                n = node1;
                node1 = node1.next;
            } else {
                n.next = node2;
                n = node2;
                node2 = node2.next;
            }
        }
        n.next = node1 == null ? node2 : node1;
        return head.next;
    }

    ListNode sort(ListNode head, int len) {
        if (len == 1) {
            return head;
        }
        int leftCount = len / 2;
        ListNode n = head;
        while (--leftCount != 0) {
            n = n.next;
        }
        ListNode temp = n.next;
        n.next = null;
        ListNode l = sort(head, len / 2);
        ListNode r = sort(temp, len - len / 2);
        return merge(l, r);
    }

    public ListNode sortList(ListNode head) {
        int len = 1;
        ListNode n = head;
        while (n != null) {
            len++;
            n = n.next;
        }
        return sort(head, len);
    }
}
