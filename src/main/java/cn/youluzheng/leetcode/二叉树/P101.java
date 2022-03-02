package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class P101 {
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root.left);
        queue.addFirst(root.right);
        while (!queue.isEmpty()) {
            TreeNode l = queue.removeLast();
            TreeNode r = queue.removeLast();
            if (l == null && r == null) {
                continue;
            }
            if (l == null || r == null || l.val != r.val) {
                return false;
            }
            queue.addFirst(l.left);
            queue.addFirst(r.right);
            queue.addFirst(l.right);
            queue.addFirst(r.left);
        }
        return true;
    }

    private boolean recursion(TreeNode left, TreeNode right) {
        if (left == null && right != null || left != null && right == null) {
            return false;
        }
        if (left == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        return recursion(left.left, right.right) && recursion(left.right, right.left);
    }

    public boolean isSymmetric2(TreeNode root) {
        return recursion(root.left, root.right);
    }
}
