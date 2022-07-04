package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

public class P105 {
    TreeNode build(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart == preEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = inStart; i < inEnd; i++) {
            if (in[i] == root.val) {
                root.left = build(pre, in, preStart + 1, preStart + 1 + i - inStart, inStart, i);
                root.right = build(pre, in, preStart + 1 + i - inStart, preEnd, i + 1, inEnd);
                break;
            }
        }
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }
}
