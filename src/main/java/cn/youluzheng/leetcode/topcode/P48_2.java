package cn.youluzheng.leetcode.topcode;

public class P48_2 {
    public void rotate(int[][] matrix) {
        int len = matrix.length - 1;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < len - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - j][i];
                matrix[len - j][i] = matrix[len - i][len - j];
                matrix[len - i][len - j] = matrix[j][len - i];
                matrix[j][len - i] = temp;
            }
        }
    }
}
