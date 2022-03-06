package cn.youluzheng.leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class P216 {

    void combine(int i, int k, int n, int sum, List<Integer> temp, List<List<Integer>> result) {
        if (k == 0) {
            if (sum == n) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int j = i + 1; j <= 9; j++) {
            if (sum + j > n) {
                break;
            }
            temp.add(j);
            combine(j, k - 1, n, sum + j, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combine(0, k, n, 0, new ArrayList<>(), result);
        return result;
    }
}
