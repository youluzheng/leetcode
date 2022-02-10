package cn.youluzheng.leetcode.数组;

/**
 * 长度最小的子数组
 */
public class P209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r;
        int min = 0x7fffffff;
        int sum = 0;
        for (r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                }
                sum -= nums[l];
                l++;
            }
        }
        return min == 0x7fffffff ? 0 : min;
    }
}
