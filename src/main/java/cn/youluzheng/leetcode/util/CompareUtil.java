package cn.youluzheng.leetcode.util;

import java.util.List;

public class CompareUtil {
    public static boolean isEqual(List<Integer> expected, ListNode node) {
        for (int i : expected) {
            if (node == null) {
                return false;
            }
            if (i != node.val) {
                return false;
            }
            node = node.next;
        }
        return node == null;
    }
}
