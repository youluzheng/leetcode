package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;

/**
 * 相交链表
 */
public class P160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p;
        ListNode q = headB;
        while (q != null) {
            p = headA;
            while (p != null && p != q) {
                p = p.next;
            }
            if (p == q) {
                break;
            }
            q = q.next;
        }
        return q;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != null && q != null) {
            p = p.next;
            q = q.next;
        }
        ListNode preP = headA;
        ListNode preQ = headB;
        while (p != null) {
            p = p.next;
            preP = preP.next;
        }
        while (q != null) {
            q = q.next;
            preQ = preQ.next;
        }
        while (preQ != preP) {
            preP = preP.next;
            preQ = preQ.next;
        }
        return preP;
    }
}
