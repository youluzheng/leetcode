package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class P530 {
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        int pre = -10000;
        TreeNode node = root;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        while (!stack.isEmpty()) {
            node = stack.pop();
            if (node.val - pre < min) {
                min = node.val - pre;
            }
            pre = node.val;
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return min;
    }
}
