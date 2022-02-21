package cn.youluzheng.leetcode.哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return result;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] > 0) {
                    return result;
                }
                int temp = nums[i] + nums[left] + nums[right];
                if (temp < 0) {
                    left++;
                    continue;
                } else if (temp == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                }
                while (right > left && nums[right] == nums[right - 1]) {
                    right--;
                }
                right--;
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }
}
