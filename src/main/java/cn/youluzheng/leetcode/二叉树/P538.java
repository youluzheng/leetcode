package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

public class P538 {

    int convert(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        root.val += convert(root.right, sum);
        return convert(root.left, root.val);
    }

    public TreeNode convertBST(TreeNode root) {
        convert(root, 0);
        return root;
    }
}
