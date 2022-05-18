package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                ret.add(matrix[up][i]);
            }
            up++;
            if (up > down) {
                break;
            }
            for (int i = up; i <= down; i++) {
                ret.add(matrix[i][right]);
            }
            right--;
            if (right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                ret.add(matrix[down][i]);
            }
            down--;
            if (down < up) {
                break;
            }
            for (int i = down; i >= up; i--) {
                ret.add(matrix[i][left]);
            }
            left++;
            if (left > right) {
                break;
            }
        }

        return ret;
    }
}
