package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class P98 {
    boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        return root.val > min && root.val < max
                && isValid(root.left, min, root.val)
                && isValid(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root.left, Long.MIN_VALUE, root.val)
                && isValid(root.right, root.val, Long.MAX_VALUE);
    }

    public boolean isValidBST2(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        long pre = Long.MIN_VALUE;
        TreeNode node = root;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        while (!stack.isEmpty()) {
            node = stack.pop();
            if (node.val <= pre) {
                return false;
            }
            pre = node.val;
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return true;
    }
}
