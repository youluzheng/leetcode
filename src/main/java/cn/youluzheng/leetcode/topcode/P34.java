package cn.youluzheng.leetcode.topcode;

public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[]{-1, -1};
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid;
            } else {
                int i;
                for (i = mid - 1; i >= low; i--) {
                    if (nums[i] != target) {
                        break;
                    }
                }
                ret[0] = i + 1;
                for (i = mid + 1; i < high; i++) {
                    if (nums[i] != target) {
                        break;
                    }
                }
                ret[1] = i - 1;
                break;
            }
        }
        return ret;
    }
}
