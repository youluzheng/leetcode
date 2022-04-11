package cn.youluzheng.leetcode.hot100;

public class P48 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int left = 0, right = matrix.length - 1; left < right; left++, right--) {
            for (int i = left; i < right; i++) {
                int temp = matrix[left][i];
                int m = left;
                int n = i;
                for (int j = 0; j < 3; j++) {
                    matrix[m][n] = matrix[len - n][m];
                    int temp_n = n;
                    n = m;
                    m = len - temp_n;
                }
                matrix[m][n] = temp;
            }
        }
    }
}
