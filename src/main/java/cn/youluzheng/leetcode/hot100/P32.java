package cn.youluzheng.leetcode.hot100;

public class P32 {
    public int longestValidParentheses(String s) {
        s = ")" + s;
        int[] dp = new int[s.length()];
        int max = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = 2 + dp[i - 2];
                } else if (s.charAt(i - 1 - dp[i - 1]) == '(') {
                    dp[i] = 2 + dp[i - 1] + dp[i - 2 - dp[i - 1]];
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
