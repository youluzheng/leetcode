package cn.youluzheng.leetcode.动态规划;

public class P718 {
    public int findLength(int[] nums1, int[] nums2) {
        int max = 0;
        int[] dp = new int[nums1.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            if (nums2[0] == nums1[i - 1]) {
                dp[i] = 1;
            }
        }
        for (int i = 1; i < nums2.length; i++) {
            for (int j = nums1.length; j > 0; j--) {
                if (nums1[j - 1] == nums2[i]) {
                    dp[j] = dp[j - 1] + 1;
                    max = Math.max(max, dp[j]);
                } else {
                    dp[j] = 0;
                }
            }
        }

        return max;
    }
}
