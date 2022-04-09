package cn.youluzheng.leetcode.hot100;

public class P33 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = (left + right) / 2;
        while (left < right) {
            if (target < nums[mid]) {
                if (target < nums[left] && nums[mid] > nums[right - 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            } else if (target == nums[mid]) {
                return mid;
            } else {
                if (target > nums[right - 1] && nums[mid] < nums[left]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
}
