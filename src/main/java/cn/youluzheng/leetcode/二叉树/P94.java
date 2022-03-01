package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.*;

public class P94 {
    private static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            stack.push(root);
            TreeNode node = root.left;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return result;
    }

    public static List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.right != null) {
                    stack.push(node.right);
                }
                stack.push(node);
                stack.push(null);
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else {
                result.add(stack.pop().val);
            }
        }
        return result;
    }
}
