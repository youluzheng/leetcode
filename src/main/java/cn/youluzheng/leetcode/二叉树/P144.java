package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P144 {
    private static void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preOrder(root, result);
        return result;
    }

    public static List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    public static List<Integer> preorderTraversal3(TreeNode root) {
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
                if (node.left != null) {
                    stack.push(node.left);
                }
                stack.push(node);
                stack.push(null);
            } else {
                result.add(stack.pop().val);
            }
        }
        return result;
    }
}
