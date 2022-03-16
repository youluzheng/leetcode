package cn.youluzheng.leetcode.动态规划;

public class P343 {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int[] dp = new int[59];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 4;
        for (int i = 5; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 2; j <= i / 2; j++) {
                int sum = dp[j] * dp[i - j];
                if (sum > max) {
                    max = sum;
                }
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
