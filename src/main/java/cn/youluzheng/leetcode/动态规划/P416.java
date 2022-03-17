package cn.youluzheng.leetcode.动态规划;

public class P416 {

    public boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            target += nums[i];
        }
        if (target % 2 != 0) {
            return false;
        }
        target /= 2;

        int[] dp = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j - nums[i]] + nums[i], dp[j]);
            }
            if (dp[target] == target) {
                return true;
            }
        }
        return false;
    }
}
