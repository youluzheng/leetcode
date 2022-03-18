package cn.youluzheng.leetcode.动态规划;

import java.util.Arrays;

public class P494 {

    int func(int index, int[] nums, int remain) {
        if (index == nums.length) {
            return remain == 0 ? 1 : 0;
        }
        return func(index + 1, nums, remain + nums[index]) +
                func(index + 1, nums, remain - nums[index]);
    }

    public int findTargetSumWays(int[] nums, int target) {
        return func(0, nums, target);
    }

    public int findTargetSumWays2(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if ((sum - target) % 2 != 0 || sum < target) {
            return 0;
        }
        target = (sum - target) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        if (nums[0] <= target) {
            dp[nums[0]] += 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = target; j >= 0; j--) {
                if (j < nums[i]) {
                    dp[j] = dp[j];
                } else {
                    dp[j] = dp[j] + dp[j - nums[i]];
                }
            }
        }
        return dp[target];
    }
}
