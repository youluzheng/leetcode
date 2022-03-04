package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

public class P654 {

    TreeNode construct(int[] nums, int left, int right) {
        if (left == right) {
            return null;
        }
        if (right - left == 1) {
            return new TreeNode(nums[left]);
        }
        int max = left;
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        TreeNode node = new TreeNode(nums[max]);
        node.left = construct(nums, left, max);
        node.right = construct(nums, max + 1, right);
        return node;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
}
