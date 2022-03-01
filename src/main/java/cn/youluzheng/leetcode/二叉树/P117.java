package cn.youluzheng.leetcode.二叉树;

import java.util.Deque;
import java.util.LinkedList;

public class P117 {
    static class Node {
        int val;
        Node left;
        Node right;
        Node next;
    }

    public Node connect(Node root) {
        Deque<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.addFirst(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                Node node = queue.removeLast();
                if (size != 0) {
                    node.next = queue.peekLast();
                }
                if (node.left != null) {
                    queue.addFirst(node.left);
                }
                if (node.right != null) {
                    queue.addFirst(node.right);
                }
            }
        }
        return root;
    }
}
