package cn.youluzheng.leetcode.回溯;

import java.util.LinkedList;
import java.util.List;

public class P491 {

    boolean contains(int var, int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] == var) {
                return true;
            }
        }
        return false;
    }

    void find(int index, int[] nums, int val, List<Integer> temp, List<List<Integer>> result) {
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] >= val) {
                temp.add(nums[i]);
                if (temp.size() > 1) {
                    result.add(new LinkedList<>(temp));
                }
                find(i, nums, nums[i], temp, result);
                temp.remove(temp.size() - 1);
            }
            while (i < nums.length - 1 && contains(nums[i + 1], nums, index + 1, i + 1)) {
                i++;
            }
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        find(-1, nums, -101, new LinkedList<>(), result);
        return result;
    }
}
