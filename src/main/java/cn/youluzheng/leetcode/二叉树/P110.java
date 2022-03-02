package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

public class P110 {

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        if (left == -1) {
            return -1;
        }
        int right = depth(root.right);
        if (right == -1) {
            return -1;
        }
        if (left - right > -2 && left - right < 2) {
            return 1 + Math.max(left, right);
        }
        return -1;
    }


    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }
}
