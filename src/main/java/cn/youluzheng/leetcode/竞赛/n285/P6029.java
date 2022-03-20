package cn.youluzheng.leetcode.竞赛.n285;

public class P6029 {
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        int[] nums = new int[12];
        for (int i = 0; i < 12; i++) {
            nums[i] = aliceArrows[i] + 1;
        }
        int[][] dp = new int[12][numArrows + 1];

        for (int i = 1; i < 12; i++) {
            for (int j = 0; j <= numArrows; j++) {
                if (j < nums[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + i);
                }
            }
        }

        int[] result = new int[12];
        int j = numArrows;
        for (int i = 11; i > 0; i--) {
            if (j < nums[i] || dp[i - 1][j] > dp[i - 1][j - nums[i]] + i) {
                result[i] = 0;
            } else {
                result[i] = nums[i];
                j -= nums[i];
            }
        }
        result[0] = j;
        return result;
    }
}
