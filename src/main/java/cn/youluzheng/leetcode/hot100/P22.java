package cn.youluzheng.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

public class P22 {

    void generateParenthesis(int left, int right, String temp, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(temp);
        }
        if (left > 0) {
            generateParenthesis(left - 1, right + 1, temp + "(", result);
        }
        if (right > 0) {
            generateParenthesis(left, right - 1, temp + ")", result);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, 0, "", result);
        return result;
    }
}
