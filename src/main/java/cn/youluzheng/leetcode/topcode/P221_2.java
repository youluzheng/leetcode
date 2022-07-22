package cn.youluzheng.leetcode.topcode;

public class P221_2 {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length + 1];
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1') {
                dp[0][i + 1] = 1;
                max = 1;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j <= matrix[i].length; j++) {
                if (matrix[i][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.max(dp[i][j - 1], dp[i - 1][j])) + 1;
                    max = Math.max(max, dp[i][j] * dp[i][j]);
                }
            }
        }
        return max;
    }
}
