package cn.youluzheng.leetcode.动态规划;

public class P188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] dp = new int[1 + 2 * k];
        for (int i = 1; i <= k; i++) {
            dp[i * 2 - 1] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = k; j >= 1; j--) {
                dp[j * 2] = Math.max(dp[j * 2], dp[j * 2 - 1] + prices[i]);
                dp[j * 2 - 1] = Math.max(dp[j * 2 - 1], dp[j * 2 - 2] - prices[i]);
            }
        }

        return dp[2 * k];
    }
}
