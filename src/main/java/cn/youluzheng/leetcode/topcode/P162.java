package cn.youluzheng.leetcode.topcode;

public class P162 {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high - 1) {
            int mid = (low + high) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                return mid;
            }
            if (nums[mid + 1] > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low == high) {
            return low;
        }
        if (low + 1 == high) {
            return nums[low] > nums[high] ? low : high;
        }
        return low;
    }
}
