package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P144 {

    void pre(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        ret.add(root.val);
        pre(root.left, ret);
        pre(root.right, ret);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        pre(root, ret);
        return ret;
    }
}
