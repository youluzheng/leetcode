package cn.youluzheng.leetcode.niuke.大疆;

import java.util.Arrays;

public class Main1 {
    public static int findMinDifference(String[] timePoints) {
        int[] n = new int[timePoints.length];
        for (int i = 0; i < timePoints.length; i++) {
            String[] temp = timePoints[i].split(":");
            n[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        }
        Arrays.sort(n);
        int min = n[0] + 24 * 60 - n[n.length - 1];
        for (int i = 1; i < n.length; i++) {
            min = Math.min(min, n[i] - n[i - 1]);
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMinDifference(new String[]{"00:03", "00:05", "23:59"}));
    }
}
