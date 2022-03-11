package cn.youluzheng.leetcode.贪心;

import java.util.Arrays;

public class P406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            }
            return y[0] - x[0];
        });
        for (int i = 0; i < people.length; i++) {
            if (people[i][1] < i) {
                int[] temp = people[i];
                // 用链表
                for (int j = i; j > temp[1]; j--) {
                    people[j] = people[j - 1];
                }
                people[temp[1]] = temp;
            }
        }
        return people;
    }
}
