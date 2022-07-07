package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

public class P98 {
    // isValid, min, max
    int[] isValid(TreeNode root) {
        if (root == null) {
            return new int[]{1};
        }
        int[] left = isValid(root.left);
        int[] right = isValid(root.right);
        if (left[0] == 0 || right[0] == 0) {
            return new int[]{0};
        }
        if (left.length != 1 && left[2] >= root.val) {
            return new int[]{0};
        }
        if (right.length != 1 && right[1] <= root.val) {
            return new int[]{0};
        }
        return new int[]{1, left.length == 1 ? root.val : left[1], right.length == 1 ? root.val : right[2]};
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root)[0] == 1;
    }
}
