package cn.youluzheng.leetcode.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeNodeTest {

    @Test
    void testConstruct() {
        int[] nums = new int[]{1, -1, 2, 3};
        TreeNode node = new TreeNode(nums);
        assertEquals(1, node.val);
        assertNull(node.left);
        assertEquals(2, node.right.val);
        assertEquals(3, node.right.left.val);
        assertNull(node.right.right);
    }

    @Test
    void testConstruct1() {
        int[] nums = new int[]{1, 2};
        TreeNode node = new TreeNode(nums);
        assertEquals(1, node.val);
        assertEquals(2, node.left.val);
        assertNull(node.right);
    }

}