package cn.youluzheng.leetcode.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P51 {

    boolean canSet(List<Integer> temp, int var) {
        for (int i = 0; i < temp.size(); i++) {
            if (var == temp.get(i) || temp.size() - i == Math.abs(var - temp.get(i))) {
                return false;
            }
        }
        return true;
    }

    void solve(int n, List<Integer> temp, List<List<String>> result) {
        if (n == temp.size()) {
            List<String> temp1 = new ArrayList<>();
            for (int var : temp) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (var == i) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                temp1.add(sb.toString());
            }
            result.add(temp1);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (canSet(temp, i)) {
                temp.add(i);
                solve(n, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new LinkedList<>();
        solve(n, new LinkedList<>(), result);
        return result;
    }
}
