package cn.youluzheng.leetcode.回溯;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P40 {
    void combine(int i, int sum, int target, int[] candidates, List<Integer> temp, List<List<Integer>> result) {
        for (i++; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            temp.add(candidates[i]);
            if (sum + candidates[i] == target) {
                result.add(new LinkedList<>(temp));
            } else {
                combine(i, sum + candidates[i], target, candidates, temp, result);
            }
            temp.remove(temp.size() - 1);
            while (i < candidates.length - 1 && candidates[i + 1] == candidates[i]) {
                i++;
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(candidates);
        combine(-1, 0, target, candidates, new LinkedList<>(), result);
        return result;
    }
}
