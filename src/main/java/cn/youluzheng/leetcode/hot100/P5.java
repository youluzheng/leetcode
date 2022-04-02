package cn.youluzheng.leetcode.hot100;

public class P5 {
    public String longestPalindrome(String s) {
        String result = "";
        int max = 0;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[i][j] = j - i + 1;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] == 0 ? 0 : dp[i + 1][j - 1] + 2;
                    }
                    if (dp[i][j] > max) {
                        result = s.substring(i, j + 1);
                        max = dp[i][j];
                    }
                }
            }
        }
        return result;
    }
}
