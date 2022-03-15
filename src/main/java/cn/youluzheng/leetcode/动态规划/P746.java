package cn.youluzheng.leetcode.动态规划;

public class P746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];
        dp[1] = 0;
        dp[2] = 0;
        for (int i = 3; i <= cost.length + 1; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 3], dp[i - 1] + cost[i - 2]);
        }
        return dp[dp.length - 1];
    }

    public int minCostClimbingStairs2(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
        return Math.min(dp[cost.length - 2], dp[cost.length - 1]);
    }
}
