package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.addLast(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> temp = new ArrayList<>();
            while (size-- != 0) {
                TreeNode node = nodes.removeFirst();
                temp.add(node.val);
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
            ret.add(temp);
        }
        return ret;
    }
}
