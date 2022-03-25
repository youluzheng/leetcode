package cn.youluzheng.leetcode.动态规划;

public class P1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text2.length()][text1.length() + 1];
        for (int i = 1; i < text1.length(); i++) {
            if (text1.charAt(i - 1) == text2.charAt(0)) {
                for (; i <= text1.length(); i++) {
                    dp[0][i] = 1;
                }
            }
        }
        for (int i = 1; i < text2.length(); i++) {
            for (int j = 1; j <= text1.length(); j++) {
                if (text2.charAt(i) == text1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[text2.length() - 1][text1.length()];
    }
}
