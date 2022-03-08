package cn.youluzheng.leetcode.贪心;

import java.util.Arrays;

public class P455 {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = g.length - 1, j = s.length - 1; i >= 0 && j >= 0; ) {
            if (s[j] >= g[i]) {
                i--;
                j--;
                count++;
            } else {
                i--;
            }
        }
        return count;
    }

}
