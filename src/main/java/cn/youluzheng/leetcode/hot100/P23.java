package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt(x -> x.val));
        for (ListNode n : lists) {
            if (n != null) {
                queue.offer(n);
            }
        }

        ListNode head = new ListNode();
        ListNode node = head;
        while (!queue.isEmpty()) {
            node.next = queue.peek();
            node = node.next;
            ListNode n = queue.poll().next;
            if (n != null) {
                queue.add(n);
            }
        }
        return head.next;
    }
}
