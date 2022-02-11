package cn.youluzheng.leetcode.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareUtilTest {

    @Test
    void isEqual_null() {
        assertTrue(CompareUtil.isEqual(List.of(), null));
    }

    @Test
    void isEqual_node_large() {
        assertFalse(CompareUtil.isEqual(List.of(), new ListNode(List.of(1))));
    }
}
