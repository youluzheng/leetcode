package cn.youluzheng.leetcode.topcode;

public class P240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_low = 0;
        int col_high = matrix[0].length - 1;
        while (row_low < matrix.length && col_high >= 0) {
            if (matrix[row_low][col_high] < target) {
                row_low++;
            } else if (matrix[row_low][col_high] == target) {
                return true;
            } else {
                col_high--;
            }
        }
        return false;
    }
}
