package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class P111 {
    public int minDepth(TreeNode root) {
        int depth = 0;
        Deque<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.addFirst(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            while (size-- != 0) {
                TreeNode node = queue.removeLast();
                boolean hasChild = false;
                if (node.left != null) {
                    hasChild = true;
                    queue.addFirst(node.left);
                }
                if (node.right != null) {
                    hasChild = true;
                    queue.addFirst(node.right);
                }
                if (!hasChild) {
                    return depth;
                }
            }
        }
        return depth;
    }
}
