package cn.youluzheng.leetcode.竞赛.n300;

import cn.youluzheng.leetcode.util.ListNode;

import java.util.Arrays;

public class P6111 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ret = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(ret[i], -1);
        }
        int up = 0, right = n - 1, down = m - 1, left = 0;
        while (true) {
            if (head == null) {
                return ret;
            }
            for (int i = left; i <= right; i++) {
                if (head == null) {
                    return ret;
                }
                ret[up][i] = head.val;
                head = head.next;
            }
            up++;
            for (int i = up; i <= down; i++) {
                if (head == null) {
                    return ret;
                }
                ret[i][right] = head.val;
                head = head.next;
            }
            right--;
            for (int i = right; i >= left; i--) {
                if (head == null) {
                    return ret;
                }
                ret[down][i] = head.val;
                head = head.next;
            }
            down--;
            for (int i = down; i >= up; i--) {
                if (head == null) {
                    return ret;
                }
                ret[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
    }
}
