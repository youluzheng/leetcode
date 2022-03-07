package cn.youluzheng.leetcode.回溯;

import java.util.LinkedList;
import java.util.List;

public class P46 {

    void permute(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int num : nums) {
            if (!temp.contains(num)) {
                temp.add(num);
                permute(nums, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        permute(nums, new LinkedList<>(), result);
        return result;
    }
}
