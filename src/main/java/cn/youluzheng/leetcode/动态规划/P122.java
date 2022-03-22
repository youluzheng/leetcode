package cn.youluzheng.leetcode.动态规划;

public class P122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];     // 创建二维数组存储状态
        dp[0][0] = -prices[0];
        dp[0][1] = 0;                   // 初始状态
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);    // 第 i 天，没有股票
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);    // 第 i 天，持有股票
        }
        return dp[n - 1][1];
    }
}


//  7  1  5  3  6  4
// -7 -1 -1  1  1  1
//  0  0  4  4  5  5

// 7 1 5 3 6 4
//