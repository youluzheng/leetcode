package cn.youluzheng.leetcode.二叉树;

import cn.youluzheng.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P530Test {

    @Test
    void getMinimumDifference() {
        TreeNode root = new TreeNode(new int[]{4, 2, 6, 1, 3});
        int actual = new P530().getMinimumDifference(root);
        assertEquals(1, actual);
    }
}