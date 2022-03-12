package cn.youluzheng.leetcode.贪心;

import java.util.Arrays;

public class P435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            }
            return x[0] - y[0];
        });
        int count = 0;
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] < right) {
                count++;
                right = intervals[i][1];
            } else if (intervals[i][0] < right) {
                count++;
            } else {
                right = intervals[i][1];
            }
        }
        return count;
    }
}
