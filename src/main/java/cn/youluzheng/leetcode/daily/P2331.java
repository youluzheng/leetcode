package cn.youluzheng.leetcode.daily;

import cn.youluzheng.leetcode.util.TreeNode;

public class P2331 {
    public static boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
