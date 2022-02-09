package cn.youluzheng.leetcode.数组;

/**
 * 二分查找
 */
public class P704 {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low != high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                // 低位可以取到
                low = mid + 1;
            } else {
                // 高位无法取到
                high = mid;
            }
        }
        return -1;
    }
}
