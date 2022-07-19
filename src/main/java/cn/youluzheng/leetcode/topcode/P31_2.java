package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.PrintUtil;

import java.util.Arrays;

public class P31_2 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int j = i + 2;
                for (; j < nums.length; j++) {
                    if (nums[j] <= nums[i]) {
                        break;
                    }
                }
                int temp = nums[j - 1];
                nums[j - 1] = nums[i];
                nums[i] = temp;
                // revert
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        P31_2 p31_2 = new P31_2();
        int[] nums = new int[]{1, 5, 1};
        p31_2.nextPermutation(nums);
        PrintUtil.print(nums);
    }
}
