package cn.youluzheng.leetcode.动态规划;

public class P123 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[5];
        dp[1] = -prices[0];
        dp[3] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[4] = Math.max(dp[4], dp[3] + prices[i]);
            dp[3] = Math.max(dp[3], dp[2] - prices[i]);
            dp[2] = Math.max(dp[2], dp[1] + prices[i]);
            dp[1] = Math.max(dp[1], dp[0] - prices[i]);
            dp[0] = Math.max(dp[0], -prices[i]);
        }

        return dp[4];
    }
}
