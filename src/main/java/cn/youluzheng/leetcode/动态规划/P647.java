package cn.youluzheng.leetcode.动态规划;

public class P647 {
    boolean isValid(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public int countSubstrings(String s) {
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            dp[i] = dp[i - 1];
            for (int j = 0; j <= i; j++) {
                if (isValid(s.substring(j, i + 1))) {
                    dp[i]++;
                }
            }
        }
        return dp[s.length() - 1];
    }

    public int countSubstrings2(String s) {
        int count = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
