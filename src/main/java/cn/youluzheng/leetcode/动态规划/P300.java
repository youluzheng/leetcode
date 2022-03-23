package cn.youluzheng.leetcode.动态规划;

public class P300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max + 1;
    }
}
