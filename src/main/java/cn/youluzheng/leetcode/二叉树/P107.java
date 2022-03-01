package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.*;

public class P107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.addFirst(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> inner = new ArrayList<>();
            int size = queue.size();
            while (size-- != 0) {
                TreeNode node = queue.removeLast();
                inner.add(node.val);
                if (node.left != null) {
                    queue.addFirst(node.left);
                }
                if (node.right != null) {
                    queue.addFirst(node.right);
                }
            }
            result.add(inner);
        }
        Collections.reverse(result);
        return result;
    }
}
