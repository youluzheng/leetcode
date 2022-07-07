package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P78 {
    void subsets(int[] nums, int index, int n, List<Integer> temp, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(temp));
        }
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            subsets(nums, i + 1, n - 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        ret.add(temp);
        for (int i = 1; i <= nums.length; i++) {
            subsets(nums, 0, i, temp, ret);
        }
        return ret;
    }
}
