package cn.youluzheng.leetcode.动态规划;

public class P115 {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length()][s.length() + 1];
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(0) == s.charAt(i)) {
                dp[0][i + 1] = count++;
            } else {
                dp[0][i + 1] = count - 1;
            }
        }
        for (int i = 1; i < t.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (t.charAt(i) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[t.length() - 1][s.length()];
    }
}
