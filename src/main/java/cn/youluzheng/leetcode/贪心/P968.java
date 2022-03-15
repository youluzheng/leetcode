package cn.youluzheng.leetcode.贪心;

import cn.youluzheng.leetcode.util.TreeNode;

public class P968 {

    int count = 0;

    TreeNode min(TreeNode father, TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = min(root, root.left);
        TreeNode right = min(root, root.right);
        if (left == null && right == null) {
            return root.val == 1 ? null : root;
        }
        count++;
        if (father != null) {
            father.val = 1;
        }
        return null;
    }

    public int minCameraCover(TreeNode root) {
        TreeNode node = min(null, root);
        return node == null ? count : count + 1;
    }
}
