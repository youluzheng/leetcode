package cn.youluzheng.leetcode.hot100;

import java.util.Arrays;

public class P10 {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[i - 1][0]) {
                dp[i + 1][0] = true;
            }
        }
        for (int i = 1; i <= p.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (p.charAt(i - 1) == '.' && dp[i - 1][j - 1]) {
                    dp[i][j] = true;
                } else if (p.charAt(i - 1) == '*') {
                    if (dp[i - 1][j] || dp[i - 2][j]) {
                        dp[i][j] = true;
                    } else if (dp[i - 1][j - 1]) {
                        if (p.charAt(i - 2) == '.') {
                            Arrays.fill(dp[i], j, dp[i].length, true);
                            break;
                        } else if (s.charAt(j - 1) == p.charAt(i - 2)) {
                            int temp = j;
                            while (j <= s.length() && s.charAt(j - 1) == p.charAt(i - 2)) {
                                dp[i][j] = true;
                                j++;
                            }
                            if (temp != j) {
                                j--;
                            }
                        }
                    }
                } else if (p.charAt(i - 1) == s.charAt(j - 1) && dp[i - 1][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[p.length()][s.length()];
    }
}
