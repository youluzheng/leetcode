package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

public class P106 {

    TreeNode build(int[] inorder, int left1, int right1, int[] postorder, int left2, int right2) {
        if (right1 - left1 == 0) {
            return null;
        }
        if (right1 - left1 == 1) {
            return new TreeNode(inorder[left1]);
        }
        TreeNode node = new TreeNode(postorder[right2 - 1]);
        int index;
        for (index = left1; inorder[index] != postorder[right2 - 1]; index++) ;
        node.left = build(inorder, left1, index, postorder, left2, left2 + index - left1);
        node.right = build(inorder, index + 1, right1, postorder, left2 + index - left1, right2 - 1);
        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
}
