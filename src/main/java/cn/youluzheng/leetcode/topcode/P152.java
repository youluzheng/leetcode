package cn.youluzheng.leetcode.topcode;

public class P152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[nums.length + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i <= nums.length; i++) {
            dp[i][0] = Math.max(nums[i - 1], Math.max(nums[i - 1] * dp[i - 1][0], nums[i - 1] * dp[i - 1][1]));
            dp[i][1] = Math.min(nums[i - 1], Math.min(nums[i - 1] * dp[i - 1][0], nums[i - 1] * dp[i - 1][1]));
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}
