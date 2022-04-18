package cn.youluzheng.leetcode.hot100;

public class P85 {

    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        int[][][] dp = new int[matrix.length + 1][matrix[0].length + 1][2];
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j][0] = dp[i][j - 1][0] + 1;
                    dp[i][j][1] = dp[i - 1][j][1] + 1;
                    int w = dp[i][j][0];
                    int h = dp[i][j][1];
                    if (w <= h) {
                        int minH = h;
                        max = Math.max(max, minH);
                        for (int k = 1; k < w; k++) {
                            minH = Math.min(minH, dp[i][j - k][1]);
                            max = Math.max(max, (k + 1) * minH);
                        }
                    } else {
                        int minW = w;
                        max = Math.max(max, minW);
                        for (int k = 1; k < h; k++) {
                            minW = Math.min(minW, dp[i - k][j][0]);
                            max = Math.max(max, minW * (k + 1));
                        }
                    }
                }
            }
        }
        return max;
    }
}
