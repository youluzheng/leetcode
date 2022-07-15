package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;

import java.util.Arrays;

public class P25 {

    void revert(ListNode head, ListNode body, ListNode end) {
        ListNode q = null;
        ListNode p = body;
        while (p != end) {
            ListNode temp = p.next;
            p.next = q;
            q = p;
            p = temp;
        }
        head.next = q;
        body.next = end;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(-1, head);
        ListNode node = newHead;
        ListNode fast = newHead;
        while (true) {
            for (int i = 0; i < k; i++) {
                fast = fast.next;
                if (fast == null) {
                    break;
                }
            }
            if (fast != null) {
                revert(node, head, fast.next);
                node = head;
                fast = head;
                head = head.next;
            } else {
                break;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        P25 p25 = new P25();
        PrintUtil.print(p25.reverseKGroup(new ListNode(Arrays.asList(1)), 2));
        PrintUtil.print(p25.reverseKGroup(new ListNode(Arrays.asList(1, 2, 3, 4, 5)), 2));
        PrintUtil.print(p25.reverseKGroup(new ListNode(Arrays.asList(1, 2, 3, 4, 5)), 3));
    }
}
