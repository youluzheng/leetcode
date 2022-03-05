package cn.youluzheng.leetcode.util;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new NullPointerException();
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        this.val = nums[0];
        this.left = null;
        this.right = null;
        if (nums.length == 1) {
            return;
        }
        queue.addFirst(this);
        int i = 1;
        while (i < nums.length - 1) {
            int var1 = nums[i++];
            int var2 = nums[i++];
            TreeNode node = queue.removeLast();
            if (var1 != -1) {
                node.left = new TreeNode(var1);
                queue.addFirst(node.left);
            }
            if (var2 != -1) {
                node.right = new TreeNode(var2);
                queue.addFirst(node.right);
            }
        }
        if (i < nums.length) {
            queue.removeLast().left = new TreeNode(nums[i]);
        }
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
