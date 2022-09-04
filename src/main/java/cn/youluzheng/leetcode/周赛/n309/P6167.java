package cn.youluzheng.leetcode.周赛.n309;

import java.util.Arrays;

public class P6167 {
    public boolean checkDistances(String s, int[] distance) {
        int[] temp = new int[26];
        Arrays.fill(temp, -1);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (temp[index] != -1) {
                if (distance[index] != i - temp[index] - 1) {
                    return false;
                }
            } else {
                temp[index] = i;
            }
        }
        return true;
    }
}
