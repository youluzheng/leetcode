package cn.youluzheng.leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class P77 {

    void combine(int i, int n, int k, List<Integer> temp, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i + 1; j <= n; j++) {
            temp.add(j);
            combine(j, n, k - 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(0, n, k, new ArrayList<>(), result);
        return result;
    }
}
