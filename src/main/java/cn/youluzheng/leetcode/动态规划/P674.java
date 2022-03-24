package cn.youluzheng.leetcode.动态规划;

public class P674 {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;

        int[] dp = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max + 1;
    }
}
