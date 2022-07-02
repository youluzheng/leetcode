package cn.youluzheng.leetcode.topcode;

public class P31 {
    void revert(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int j = i + 2;
                for (; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        break;
                    }
                }
                j--;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                revert(nums, i + 1);
                return;
            }
        }
        revert(nums, 0);
    }
}
