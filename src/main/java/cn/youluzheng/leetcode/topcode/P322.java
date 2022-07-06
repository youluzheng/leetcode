package cn.youluzheng.leetcode.topcode;

import java.util.Arrays;

public class P322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 1, amount + 1, Integer.MAX_VALUE);
        for (int i = 1; i <= amount; i++) {
            for (int j : coins) {
                if (i < j || dp[i - j] == Integer.MAX_VALUE) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - j] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
//        int ret = new P322().coinChange(new int[]{1, 2, 5}, 11);
        int ret = new P322().coinChange(new int[]{186, 419, 83, 408}, 6249);
        System.out.println(ret);
    }
}
