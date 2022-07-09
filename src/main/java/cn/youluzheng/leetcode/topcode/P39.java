package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P39 {

    void combination(int[] candidates, int index, int target, int sum, List<Integer> temp, List<List<Integer>> ret) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            ret.add(new ArrayList<>(temp));
            return;
        }
        for (; index < candidates.length; index++) {
            temp.add(candidates[index]);
            combination(candidates, index, target, sum + candidates[index], temp, ret);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        combination(candidates, 0, target, 0, new ArrayList<>(), ret);
        return ret;
    }
}
