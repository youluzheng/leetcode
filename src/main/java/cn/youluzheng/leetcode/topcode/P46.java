package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P46 {
    void permute(int[] nums, Set<Integer> temp, List<Integer> temp1, List<List<Integer>> ret) {
        if (temp.size() == nums.length) {
            ret.add(new ArrayList<>(temp1));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(i)) {
                continue;
            }
            temp.add(i);
            temp1.add(nums[i]);
            permute(nums, temp, temp1, ret);
            temp.remove(i);
            temp1.remove(temp1.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        permute(nums, new HashSet<>(), new ArrayList<>(), ret);
        return ret;
    }
}
