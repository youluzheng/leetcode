package cn.youluzheng.leetcode.topcode;

public class P5 {
    public String longestPalindrome(String s) {
        String ret = "";
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2) {
                        dp[i][j] = j - i + 1;
                    } else if (dp[i + 1][j - 1] != 0) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                    if (dp[i][j] > ret.length()) {
                        ret = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ret;
    }
}
