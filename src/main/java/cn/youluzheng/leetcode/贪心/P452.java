package cn.youluzheng.leetcode.贪心;

import java.util.Arrays;

public class P452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (x, y) -> {
            if (x[0] > y[0]) {
                return 1;
            } else if (x[0] == y[0]) {
                if (x[1] > y[1]) {
                    return 1;
                }
            }
            return -1;
        });

        int count = 1;
        int rightMin = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= rightMin) {
                if (points[i][1] < rightMin) {
                    rightMin = points[i][1];
                }
            } else {
                count++;
                rightMin = points[i][1];
            }
        }
        return count;
    }
}
