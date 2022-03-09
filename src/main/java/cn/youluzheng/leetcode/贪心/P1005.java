package cn.youluzheng.leetcode.贪心;

import java.util.Arrays;

public class P1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
            if (Math.abs(nums[i]) < min) {
                min = Math.abs(nums[i]);
            }
            sum += nums[i];
        }
        if (k % 2 != 0) {
            sum -= 2 * min;
        }
        return sum;
    }
}
