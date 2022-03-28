package cn.youluzheng.leetcode.动态规划;

public class P72 {
    public int minDistance(String word1, String word2) {
        if (word2.length() == 0) {
            return word1.length();
        }
        if (word1.length() == 0) {
            return word2.length();
        }
        int[][] dp = new int[word1.length()][word2.length() + 1];
        for (int i = 0; i < word1.length(); i++) {
            dp[i][0] = i + 1;
        }
        boolean find = false;
        if (word2.charAt(0) != word1.charAt(0)) {
            dp[0][1] = 1;
        } else {
            find = true;
        }
        for (int i = 2; i <= word2.length(); i++) {
            if (!find && word2.charAt(i - 1) == word1.charAt(0)) {
                dp[0][i] = dp[0][i - 1];
                find = true;
            } else {
                dp[0][i] = dp[0][i - 1] + 1;
            }
        }
        for (int i = 1; i < word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[word1.length() - 1][word2.length()];
    }
}
