package cn.youluzheng.leetcode.动态规划;

public class P1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums2.length][nums1.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            if (nums1[i - 1] == nums2[0]) {
                for (; i <= nums1.length; i++) {
                    dp[0][i] = 1;
                }
            }
        }
        for (int i = 1; i < nums2.length; i++) {
            for (int j = 1; j <= nums1.length; j++) {
                if (nums2[i] == nums1[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[nums2.length - 1][nums1.length];
    }
}
