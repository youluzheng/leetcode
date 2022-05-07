package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;

public class P160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode nodeA = headA;
        while (nodeA != null) {
            lenA++;
            nodeA = nodeA.next;
        }
        ListNode nodeB = headB;
        while (nodeB != null) {
            lenB++;
            nodeB = nodeB.next;
        }
        if (lenA == 0 || lenB == 0) {
            return null;
        }
        nodeA = headA;
        nodeB = headB;
        int diff;
        if (lenA > lenB) {
            diff = lenA - lenB;
            while (diff-- != 0) {
                nodeA = nodeA.next;
            }
        } else {
            diff = lenB - lenA;
            while (diff-- != 0) {
                nodeB = nodeB.next;
            }
        }
        while (nodeA != null || nodeB != null) {
            if (nodeA == nodeB) {
                return nodeA;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }
}
