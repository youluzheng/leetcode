package cn.youluzheng.leetcode.回溯;

import java.util.LinkedList;
import java.util.List;

public class P131 {

    boolean judge(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    void partition(String s, List<String> temp, List<List<String>> result) {
        for (int i = 1; i <= s.length(); i++) {
            String sub = s.substring(0, i);
            if (judge(sub)) {
                temp.add(sub);
                if (i == s.length()) {
                    result.add(new LinkedList<>(temp));
                } else {
                    partition(s.substring(i), temp, result);
                }
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        partition(s, new LinkedList<>(), result);
        return result;
    }
}
