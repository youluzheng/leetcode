package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P501 {
    int value;
    int count;
    int max;
    List<Integer> result = new ArrayList<>();

    void find(TreeNode root) {
        if (root == null) {
            return;
        }
        find(root.left);
        if (root.val == value) {
            count++;
        } else {
            if (count > max) {
                result.clear();
                result.add(value);
                max = count;
            } else if (count == max) {
                result.add(value);
            }
            value = root.val;
            count = 1;
        }
        find(root.right);
    }

    public int[] findMode(TreeNode root) {
        value = root.val;
        find(root);
        if (count > max) {
            result.clear();
            result.add(value);
            max = count;
        } else if (count == max) {
            result.add(value);
        }
        int[] ret = new int[result.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
