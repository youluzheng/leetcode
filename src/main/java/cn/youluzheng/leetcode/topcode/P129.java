package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

public class P129 {
    int sum(TreeNode root, int value) {
        if (root == null) {
            return 0;
        }
        value = value * 10 + root.val;
        if (root.left == null && root.right == null) {
            return value;
        }
        return sum(root.left, value) +
                sum(root.right, value);
    }

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
}
