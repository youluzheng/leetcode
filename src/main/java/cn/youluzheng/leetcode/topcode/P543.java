package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

public class P543 {
    int max = 0;

    int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
}
