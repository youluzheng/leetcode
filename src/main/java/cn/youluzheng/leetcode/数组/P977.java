package cn.youluzheng.leetcode.数组;

/**
 * 有序数组的平方
 */
public class P977 {
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length - 1;
        int min = 0;
        int max = length;
        int[] result = new int[nums.length];
        while (min <= max) {
            if (nums[min] * nums[min] >= nums[max] * nums[max]) {
                result[length] = nums[min] * nums[min];
                min++;
            } else {
                result[length] = nums[max] * nums[max];
                max--;
            }
            length--;
        }
        return result;
    }
}
