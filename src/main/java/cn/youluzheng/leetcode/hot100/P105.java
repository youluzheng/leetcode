package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.TreeNode;

public class P105 {

    TreeNode buildTree(int[] preorder, int left1, int right1, int[] inorder, int left2, int right2) {
        if (left1 == right1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[left1]);
        int newLeft = left2;
        for (; newLeft < right2; newLeft++) {
            if (inorder[newLeft] == preorder[left1]) {
                break;
            }
        }
        root.left = buildTree(preorder, left1 + 1, left1 + newLeft - left2 + 1, inorder, left2, newLeft);
        root.right = buildTree(preorder, left1 + newLeft - left2 + 1, right1, inorder, newLeft + 1, right2);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
}
