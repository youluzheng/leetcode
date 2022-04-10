package cn.youluzheng.leetcode.hot100;

public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                int i = mid;
                while (i >= left && nums[i] == target) {
                    i--;
                }
                result[0] = i + 1;
                i = mid;
                while (i < right && nums[i] == target) {
                    i++;
                }
                result[1] = i - 1;
                break;
            }
        }
        return result;
    }
}
