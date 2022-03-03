package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class P257 {

    private void path(TreeNode root, String s, List<String> result) {
        if (root == null) {
            return;
        }
        if (s.equals("")) {
            s = String.valueOf(root.val);
        } else {
            s = s + "->" + root.val;
        }
        if (root.left == null && root.right == null) {
            result.add(s);
        }
        path(root.left, s, result);
        path(root.right, s, result);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        path(root, "", list);
        return list;
    }
}
