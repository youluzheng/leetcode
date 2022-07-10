package cn.youluzheng.leetcode.周赛.n286;

import java.util.List;

public class P5269 {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[][] dp = new int[piles.size()][k + 1];
        for (int i = 1; i <= k; i++) {
            if (i > piles.get(0).size()) {
                dp[0][i] = dp[0][i - 1];
            } else {
                dp[0][i] = piles.get(0).get(i - 1) + dp[0][i - 1];
            }
        }
        for (int i = 1; i < piles.size(); i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];
                int sum = 0;
                for (int m = 1; m <= j && m <= piles.get(i).size(); m++) {
                    sum += piles.get(i).get(m - 1);
                    dp[i][j] = Math.max(dp[i][j], sum + dp[i - 1][j - m]);
                }
            }
        }
        return dp[piles.size() - 1][k];
    }
}
