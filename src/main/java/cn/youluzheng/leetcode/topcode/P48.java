package cn.youluzheng.leetcode.topcode;

public class P48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = n - 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < m - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m - j][i];
                matrix[m - j][i] = matrix[m - i][m - j];
                matrix[m - i][m - j] = matrix[j][m - i];
                matrix[j][m - i] = temp;
            }
        }
    }
}
