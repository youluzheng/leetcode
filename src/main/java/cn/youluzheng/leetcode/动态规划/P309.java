package cn.youluzheng.leetcode.动态规划;

public class P309 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];

        dp[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
        }

        return dp[prices.length - 1][2];
    }
}
