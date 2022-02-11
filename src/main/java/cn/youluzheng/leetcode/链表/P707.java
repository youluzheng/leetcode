package cn.youluzheng.leetcode.链表;

import cn.youluzheng.leetcode.util.ListNode;

/**
 * 设计链表
 */
public class P707 {
    static class MyLinkedList {
        private final ListNode head;
        private int length;

        public MyLinkedList() {
            this.head = new ListNode(-1, null);
            length = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= this.length) {
                return -1;
            }
            ListNode p = this.head.next;
            while (index != 0) {
                index--;
                p = p.next;
            }
            return p.val;
        }

        public void addAtHead(int val) {
            this.addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            this.addAtIndex(this.length, val);
        }

        public void addAtIndex(int index, int val) {
            if (index > this.length) {
                return;
            }
            this.length++;
            if (index <= 0) {
                index = 0;
            }
            ListNode p = head;
            while (index != 0) {
                index--;
                p = p.next;
            }
            p.next = new ListNode(val, p.next);
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= this.length) {
                return;
            }
            this.length--;
            ListNode p = head;
            while (index != 0) {
                index--;
                p = p.next;
            }
            p.next = p.next.next;
        }

        public void print() {
            ListNode p = this.head.next;
            while (p != null) {
                System.out.print(p.val + ", ");
                p = p.next;
            }
            System.out.println();
        }
    }
}
