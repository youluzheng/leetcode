package cn.youluzheng.leetcode.hot100;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P200 {
    public int numIslands(char[][] grid) {
        char[][] newGrid = new char[grid.length + 2][grid[0].length + 2];
        Arrays.fill(newGrid[0], '0');
        Arrays.fill(newGrid[newGrid.length - 1], '0');
        for (int i = 0; i < grid.length; i++) {
            newGrid[i + 1][0] = '0';
            newGrid[i + 1][newGrid[i].length - 1] = '0';
            System.arraycopy(grid[i], 0, newGrid[i + 1], 1, grid[i].length);
        }
        int ret = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= grid.length; i++) {
            for (int j = 1; j <= grid[i - 1].length; j++) {
                if (newGrid[i][j] == '1') {
                    deque.offer(new int[]{i, j});
                    newGrid[i][j] = '0';
                    while (!deque.isEmpty()) {
                        int[] pair = deque.poll();
                        int ii = pair[0];
                        int ij = pair[1];
                        if (newGrid[ii - 1][ij] == '1') {
                            deque.offer(new int[]{ii - 1, ij});
                            newGrid[ii - 1][ij] = '0';
                        }
                        if (newGrid[ii][ij + 1] == '1') {
                            deque.offer(new int[]{ii, ij + 1});
                            newGrid[ii][ij + 1] = '0';
                        }
                        if (newGrid[ii + 1][ij] == '1') {
                            deque.offer(new int[]{ii + 1, ij});
                            newGrid[ii + 1][ij] = '0';
                        }
                        if (newGrid[ii][ij - 1] == '1') {
                            deque.offer(new int[]{ii, ij - 1});
                            newGrid[ii][ij - 1] = '0';
                        }
                    }
                    ret++;
                }
            }
        }
        return ret;
    }
}
