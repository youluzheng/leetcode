package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

public class P124 {
    int max = Integer.MIN_VALUE;

    int max1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = max1(root.left);
        int right = max1(root.right);
        max = Math.max(left + right + root.val, max);
        return Math.max(Math.max(left, right) + root.val, 0);
    }

    public int maxPathSum(TreeNode root) {
        max1(root);
        return max;
    }
}
