package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

public class P108 {

    TreeNode sorted(int[] nums, int left, int right) {
        if (right - left == 0) {
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sorted(nums, left, middle);
        root.right = sorted(nums, middle + 1, right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length);
    }
}
