package cn.youluzheng.leetcode.动态规划;

import cn.youluzheng.leetcode.util.TreeNode;

public class P337 {

    int[] func(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = func(root.left);
        int[] right = func(root.right);
        return new int[]{Math.max(left[0], left[1]) + Math.max(right[0], right[1]), left[0] + right[0] + root.val};
    }

    public int rob(TreeNode root) {
        int[] ret = func(root);
        return Math.max(ret[0], ret[1]);
    }

}
