package cn.youluzheng.leetcode.topcode;

import java.util.Deque;
import java.util.LinkedList;

public class P695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    deque.offer(i);
                    deque.offer(j);
                    grid[i][j] = 0;
                    int count = 0;
                    while (!deque.isEmpty()) {
                        count++;
                        int ii = deque.poll();
                        int jj = deque.poll();
                        if (grid[Math.max(ii - 1, 0)][jj] != 0) {
                            deque.offer(Math.max(ii - 1, 0));
                            deque.offer(jj);
                            grid[Math.max(ii - 1, 0)][jj] = 0;
                        }
                        if (grid[ii][Math.min(jj + 1, grid[ii].length - 1)] != 0) {
                            deque.offer(ii);
                            deque.offer(Math.min(jj + 1, grid[ii].length - 1));
                            grid[ii][Math.min(jj + 1, grid[ii].length - 1)] = 0;
                        }
                        if (grid[Math.min(ii + 1, grid.length - 1)][jj] != 0) {
                            deque.offer(Math.min(ii + 1, grid.length - 1));
                            deque.offer(jj);
                            grid[Math.min(ii + 1, grid.length - 1)][jj] = 0;
                        }
                        if (grid[ii][Math.max(jj - 1, 0)] != 0) {
                            deque.offer(ii);
                            deque.offer(Math.max(jj - 1, 0));
                            grid[ii][Math.max(jj - 1, 0)] = 0;
                        }
                    }
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}
