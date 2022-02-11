package cn.youluzheng.leetcode.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ListNodeTest {
    @Test
    void testConstruct() {
        ListNode node = new ListNode(List.of(1, 2, 3));
        PrintUtil.print(node);
        assertTrue(CompareUtil.isEqual(List.of(1, 2, 3), node));
    }
}