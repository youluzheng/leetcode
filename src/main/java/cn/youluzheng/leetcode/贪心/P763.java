package cn.youluzheng.leetcode.贪心;

import java.util.ArrayList;
import java.util.List;

public class P763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] help = new int[26];
        for (int i = 0; i < s.length(); i++) {
            help[s.charAt(i) - 'a'] = i;
        }
        int index = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            int right1 = help[s.charAt(i) - 'a'];
            if (right1 > right) {
                right = right1;
            }
            if (i == right) {
                result.add(right - index + 1);
                index = right + 1;
            }
        }
        return result;
    }
}
