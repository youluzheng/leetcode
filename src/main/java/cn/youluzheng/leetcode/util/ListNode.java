package cn.youluzheng.leetcode.util;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(List<Integer> vals) {
        ListNode node = null;
        for (int i = vals.size() - 1; i > 0; i--) {
            node = new ListNode(vals.get(i), node);
        }
        this.val = vals.get(0);
        this.next = node;
    }
}
