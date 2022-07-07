package cn.youluzheng.leetcode.topcode;

import java.util.HashMap;
import java.util.Map;

public class P146 {
    public static class LRUCache {

        class ListNode {
            public int key;
            public int val;
            public ListNode pre;
            public ListNode next;

            public ListNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }

        int capacity;
        Map<Integer, ListNode> map;
        ListNode head;
        ListNode tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>(capacity);
        }

        private void moveToHead(ListNode node) {
            if (node == head) {
                return;
            }
            if (tail == node) {
                tail = node.pre;
                tail.next = null;
            } else {
                node.pre.next = node.next;
                node.next.pre = node.pre;
            }
            node.next = head;
            node.pre = null;
            head.pre = node;
            head = node;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                ListNode node = map.get(key);
                moveToHead(node);
                return node.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                ListNode node = map.get(key);
                node.val = value;
                moveToHead(node);
            } else {
                ListNode node = new ListNode(key, value);
                if (map.size() == capacity) {
                    ListNode last = tail;
                    map.remove(last.key);
                    tail = tail.pre;
                    if (tail != null) {
                        tail.next = null;
                    }
                }
                if (head != null) {
                    node.next = head;
                    head.pre = node;
                }
                head = node;
                if (tail == null) {
                    tail = node;
                }
                map.put(key, node);
            }
        }
    }
}
