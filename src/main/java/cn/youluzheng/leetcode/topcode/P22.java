package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P22 {
    void generate(int left, int right, List<String> result, String add) {
        if (left == 0 && right == 0) {
            result.add(add);
            return;
        }
        if (left != 0) {
            generate(left - 1, right, result, add + "(");
        }
        if (right > left) {
            generate(left, right - 1, result, add + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, n, result, "");
        return result;
    }
}
