package cn.youluzheng.leetcode.贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            }
            return x[0] - y[0];
        });
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{intervals[0][0], intervals[0][1]});
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > result.get(result.size() - 1)[1]) {
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            } else if (intervals[i][1] > result.get(result.size() - 1)[1]) {
                result.get(result.size() - 1)[1] = intervals[i][1];
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
