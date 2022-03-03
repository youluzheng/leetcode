package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class P404 {

    void sum(TreeNode root, boolean isLeft, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (isLeft && root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        sum(root.left, true, list);
        sum(root.right, false, list);
    }


    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> sumList = new LinkedList<>();
        sum(root.left, true, sumList);
        sum(root.right, false, sumList);
        return sumList.stream().reduce(0, (left, right) -> left += right);
    }
}
