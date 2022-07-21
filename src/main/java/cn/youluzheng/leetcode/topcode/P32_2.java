package cn.youluzheng.leetcode.topcode;

public class P32_2 {
    public int longestValidParentheses(String s) {
        int max = 0;
        s = ")" + s;
        int[] dp = new int[s.length()];
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = 2 + dp[i - 2];
                } else if (s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = 2 + dp[i - 1] + dp[i - dp[i - 1] - 2];
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
