package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        boolean flag = true;
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> temp = new ArrayList<>();
            if (!flag) {
                while (size-- != 0) {
                    TreeNode node = deque.removeFirst();
                    temp.add(node.val);
                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                    }
                }
            } else {
                while (size-- != 0) {
                    TreeNode node = deque.removeLast();
                    temp.add(node.val);
                    if (node.right != null) {
                        deque.addFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.addFirst(node.left);
                    }
                }
            }
            flag = !flag;
            ret.add(temp);
        }
        return ret;
    }
}
