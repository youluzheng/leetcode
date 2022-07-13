package cn.youluzheng.leetcode.topcode;

import java.util.HashMap;
import java.util.Map;

public class P138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        map.put(null, null);
        Node node1 = head;
        while (node1 != null) {
            Node n = new Node(node1.val);
            map.put(node1, n);
            node1 = node1.next;
        }
        node1 = head;
        while (node1 != null) {
            map.get(node1).next = map.get(node1.next);
            map.get(node1).random = map.get(node1.random);
            node1 = node1.next;
        }
        return map.get(head);
    }
}
