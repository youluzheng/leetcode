package cn.youluzheng.leetcode.util;

public class PrintUtil {

    public static void print(int[] target) {
        for (int i : target) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void print(int[][] target) {
        for (int[] i : target) {
            PrintUtil.print(i);
        }
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }
}
