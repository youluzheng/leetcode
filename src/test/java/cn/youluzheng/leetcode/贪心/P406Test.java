package cn.youluzheng.leetcode.贪心;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class P406Test {

    @Test
    void test() {
        int[][] nums = new int[][]{{3, 2}, {4, 3}, {1, 5}, {4, 1}};
        Arrays.sort(nums, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            }
            return y[0] - x[0];
        });
        for (var n : nums) {
            System.out.println(n[0] + ", " + n[1]);
        }
    }

    @Test
    void reconstructQueue() {
        int[][] nums = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        var result = new P406().reconstructQueue(nums);
        for (var n : nums) {
            System.out.println(n[0] + ", " + n[1]);
        }
    }

}