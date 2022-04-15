package cn.youluzheng.leetcode.hot100;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P114 {

    void dfs(TreeNode root, List<TreeNode> node) {
        if (root == null) {
            return;
        }
        node.add(root);
        dfs(root.left, node);
        dfs(root.right, node);
    }

    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        dfs(root, nodes);
        TreeNode n = root;
        for (int i = 1; i < nodes.size(); i++) {
            n.right = nodes.get(i);
            n.left = null;
            n = n.right;
        }
        n.right = null;
    }
}
