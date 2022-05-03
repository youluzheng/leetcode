package cn.youluzheng.leetcode.topcode;

public class P121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (dp[i - 1] + diff > 0) {
                dp[i] = dp[i - 1] + diff;
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
