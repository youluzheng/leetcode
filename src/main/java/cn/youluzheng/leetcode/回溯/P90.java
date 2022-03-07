package cn.youluzheng.leetcode.回溯;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P90 {
    void subsets(int count, int index, int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (count == 0) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i = index + 1; i < nums.length; i++) {
            temp.add(nums[i]);
            subsets(count - 1, i, nums, temp, result);
            temp.remove(temp.size() - 1);
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length + 1; i++) {
            subsets(i, -1, nums, new LinkedList<>(), result);
        }
        return result;
    }
}
