package cn.youluzheng.leetcode.哈希表;

import java.util.ArrayList;
import java.util.List;

public class P1002 {
    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[][] count = new int[2][26];
        for (int i = 0; i < 26; i++) {
            count[0][i] = 0x7fffffff;
            count[1][i] = 0;
        }
        for (String s : words) {
            for (char ch : s.toCharArray()) {
                count[1][ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                count[0][i] = Math.min(count[0][i], count[1][i]);
                count[1][i] = 0;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (count[0][i]-- != 0) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }
}
