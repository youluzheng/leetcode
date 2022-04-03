package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.ListNode;

public class P21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode node = head;
        ListNode p = list1, q = list2;
        while (p != null && q != null) {
            if (p.val < q.val) {
                node.next = p;
                p = p.next;
            } else {
                node.next = q;
                q = q.next;
            }
            node = node.next;
        }
        if (p == null) {
            p = q;
        }
        node.next = p == null ? q : p;
        return head.next;
    }
}
