package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P113 {
    void sum(TreeNode root, int targetSum, int tempSum, List<Integer> temp, List<List<Integer>> ret) {
        if (root == null) {
            return;
        }
        if (tempSum + root.val > targetSum) {
            return;
        }
        temp.add(tempSum);
        tempSum += root.val;
        if (root.left == null && root.right == null) {
            if (tempSum == targetSum) {
                ret.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size() - 1);
            return;
        }
        if (root.left != null) {
            sum(root.left, targetSum, tempSum, temp, ret);
        }
        if (root.right != null) {
            sum(root.right, targetSum, tempSum, temp, ret);
        }
        temp.remove(temp.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ret = new ArrayList<>();
        sum(root, targetSum, 0, new ArrayList<>(), ret);
        return ret;
    }
}
