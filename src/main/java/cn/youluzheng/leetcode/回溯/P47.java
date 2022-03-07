package cn.youluzheng.leetcode.回溯;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class P47 {

    void permute(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            List<Integer> temp1 = new LinkedList<>();
            for (int val : temp) {
                temp1.add(nums[val]);
            }
            result.add(temp1);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(i) && !set.contains(nums[i])) {
                set.add(nums[i]);
                temp.add(i);
                permute(nums, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        permute(nums, new LinkedList<>(), result);
        return result;
    }
}
