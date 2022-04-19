package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.TreeNode;

public class P124 {
    int max = Integer.MIN_VALUE;

    int max(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = max(root.left);
        int right = max(root.right);
        int innerValue = root.val;
        int outerValue = root.val;
        if (left > 0 && right > 0) {
            innerValue += left + right;
            outerValue += Math.max(left, right);
        } else if (left > 0 || right > 0) {
            innerValue += Math.max(left, right);
            outerValue += Math.max(left, right);
        }
        max = Math.max(max, innerValue);
        return outerValue;
    }

    public int maxPathSum(TreeNode root) {
        max(root);
        return max;
    }
}
