package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class P662 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ret = 1;
        Deque<TreeNode> deque = new LinkedList<>();
        root.val = 1;
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            int min = -1;
            int max = -1;
            while (size-- != 0) {
                TreeNode node = deque.poll();
                if (min == -1) {
                    min = node.val;
                    max = node.val;
                } else {
                    max = node.val;
                }
                if (node.left != null) {
                    node.left.val = 2 * node.val;
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    node.right.val = 2 * node.val + 1;
                    deque.offer(node.right);
                }
            }
            ret = Math.max(ret, max - min + 1);
        }
        return ret;
    }
}
