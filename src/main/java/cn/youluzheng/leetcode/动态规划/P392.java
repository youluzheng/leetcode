package cn.youluzheng.leetcode.动态规划;

import java.util.Arrays;

public class P392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        if (s.length() > t.length()) {
            return false;
        }
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public boolean isSubsequence2(String s, String t) {
        boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];
        Arrays.fill(dp[0], true);
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[s.length()][t.length()];
    }

    public boolean isSubsequence3(String s, String t) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < t.length(); i++) {
            for (int j = s.length(); j > 0; j--) {
                if (t.charAt(i) == s.charAt(j - 1)) {
                    dp[j] = dp[j - 1];
                }
            }
        }
        return dp[s.length()];
    }
}
