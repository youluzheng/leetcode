package cn.youluzheng.leetcode.topcode;

public class P912 {
    void sort(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }
        int oldLeft = left;
        int oldRight = right;
        int value = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= value) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
                left++;
            }
            while (left < right && nums[left] <= value) {
                left++;
            }
            if (left < right) {
                nums[right] = nums[left];
                right--;
            }
        }
        nums[left] = value;
        sort(nums, oldLeft, left - 1);
        sort(nums, left + 1, oldRight);
    }

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
}
