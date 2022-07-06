package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

public class P110 {
    int balanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = balanced(root.left);
        int right = balanced(root.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) <= 1) {
            return Math.max(left, right) + 1;
        }
        return -1;
    }

    public boolean isBalanced(TreeNode root) {
        return balanced(root) != -1;
    }
}
