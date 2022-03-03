package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

public class P513 {

    int maxDepth;
    int max;

    void leftValue(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth + 1 > maxDepth) {
            maxDepth = depth + 1;
            max = root.val;
        }
        leftValue(root.left, depth + 1);
        leftValue(root.right, depth + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        leftValue(root, 0);
        return max;
    }
}
