package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.ListNode;
import cn.youluzheng.leetcode.util.PrintUtil;

import java.util.Arrays;

public class P143_2 {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
            }
        }
        ListNode pre = null;
        ListNode next = slow.next;
        while (next != null) {
            ListNode temp = next.next;
            next.next = pre;
            pre = next;
            next = temp;
        }
        slow.next = null;
        fast = pre;
        slow = head;
        while (fast != null) {
            ListNode slowTemp = slow.next;
            ListNode fastTemp = fast.next;
            slow.next = fast;
            fast.next = slowTemp;
            slow = slowTemp;
            fast = fastTemp;
        }
    }

    public static void main(String[] args) {
        P143_2 p143_2 = new P143_2();
        ListNode node = new ListNode(Arrays.asList(1, 2, 3, 4));
        p143_2.reorderList(node);
        PrintUtil.print(node);
    }
}
