package cn.youluzheng.leetcode.周赛.n300;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P6110 {
    public int countPaths(int[][] grid) {
        List<int[]> array = new ArrayList<>();
        int[][] ret = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ret[i][j] = 1;
                array.add(new int[]{i, j});
            }
        }
        array.sort(Comparator.comparingInt(x -> grid[x[0]][x[1]]));
        int sum = 0;
        for (int[] entry : array) {
            int i = entry[0];
            int j = entry[1];
            if (grid[Math.max(0, i - 1)][j] < grid[i][j]) {
                ret[i][j] = (ret[i][j] + ret[i - 1][j]) % 1000000007;
            }
            if (grid[i][Math.min(grid[i].length - 1, j + 1)] < grid[i][j]) {
                ret[i][j] = (ret[i][j] + ret[i][j + 1]) % 1000000007;
            }
            if (grid[Math.min(grid.length - 1, i + 1)][j] < grid[i][j]) {
                ret[i][j] = (ret[i][j] + ret[i + 1][j]) % 1000000007;
            }
            if (grid[i][Math.max(0, j - 1)] < grid[i][j]) {
                ret[i][j] = (ret[i][j] + ret[i][j - 1]) % 1000000007;
            }
            sum = (sum + ret[i][j]) % 1000000007;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1}, {2}};
        int sum = new P6110().countPaths(grid);
        System.out.println(sum);
    }
}
