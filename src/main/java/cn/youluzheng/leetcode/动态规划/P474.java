package cn.youluzheng.leetcode.动态规划;

public class P474 {

    int getZero(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length][m + 1][n + 1];
        for (int i = getZero(strs[0]); i <= m; i++) {
            for (int j = strs[0].length() - getZero(strs[0]); j <= n; j++) {
                dp[0][i][j] = 1;
            }
        }
        for (int i = 1; i < strs.length; i++) {
            int count0 = getZero(strs[i]);
            int count1 = strs[i].length() - count0;
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    if (count0 > j || count1 > k) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - count0][k - count1] + 1);
                    }
                }
            }
        }
        return dp[strs.length - 1][m][n];
    }
}
