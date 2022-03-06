package cn.youluzheng.leetcode.回溯;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17 {

    Map<Character, String> map = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    void letter(String digists, int index, String temp, List<String> result) {
        if (index == digists.length()) {
            result.add(temp);
            return;
        }
        String target = map.get(digists.charAt(index));
        for (int i = 0; i < target.length(); i++) {
            letter(digists, index + 1, temp + target.charAt(i), result);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (!digits.equals("")) {
            letter(digits, 0, "", result);
        }
        return result;
    }
}
