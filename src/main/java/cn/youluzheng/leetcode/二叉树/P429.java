package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.addFirst(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> inner = new ArrayList<>();
            int size = queue.size();
            while (size-- != 0) {
                Node node = queue.removeLast();
                inner.add(node.val);
                for (Node n : node.children) {
                    queue.addFirst(n);
                }
            }
            result.add(inner);
        }
        return result;
    }
}
