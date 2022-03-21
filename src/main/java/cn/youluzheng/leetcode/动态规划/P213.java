package cn.youluzheng.leetcode.动态规划;

public class P213 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = nums[nums.length - 1];
        dp[2] = dp[1];
        for (int i = 1; i < nums.length - 2; i++) {
            dp[i + 2] = Math.max(dp[i] + nums[i], dp[i + 1]);
        }
        int max = dp[nums.length - 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            dp[i + 1] = Math.max(dp[i - 1] + nums[i], dp[i]);
        }
        return Math.max(dp[nums.length - 1], max);
    }
}
