package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15_2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int m = i + 1;
            int n = nums.length - 1;
            int target = -nums[i];
            while (m < n) {
                int sum = nums[m] + nums[n];
                if (sum < target) {
                    m++;
                } else if (sum > target) {
                    n--;
                } else {
                    ret.add(Arrays.asList(nums[i], nums[m], nums[n]));
                    m++;
                    while (m < n && nums[m] == nums[m - 1]) {
                        m++;
                    }
                    n--;
                    while (n > m && nums[n] == nums[n + 1]) {
                        n--;
                    }
                }
            }
        }
        return ret;
    }
}
