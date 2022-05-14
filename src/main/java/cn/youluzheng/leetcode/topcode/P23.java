package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x.val));
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        ListNode head = new ListNode();
        ListNode p = head;
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            queue.remove(p);
            if (p.next != null) {
                queue.add(p.next);
            }
        }
        return head.next;
    }
}
