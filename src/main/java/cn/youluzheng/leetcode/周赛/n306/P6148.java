package cn.youluzheng.leetcode.周赛.n306;

import cn.youluzheng.leetcode.util.PrintUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class P6148 {

    public static int[][] largestLocal(int[][] grid) {
        int[][] ret = new int[grid.length - 2][grid[0].length - 2];
        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) ->
                Integer.compare(grid[y[0]][y[1]], grid[x[0]][x[1]])
        );
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                queue.offer(new int[]{i, j});
            }
        }
        int[] max = queue.peek();
        ret[0][0] = grid[max[0]][max[1]];
        for (int j = 3; j < grid.length; j++) {
            for (int i = 0; i < 3; i++) {
                queue.offer(new int[]{i, j});
            }
            List<int[]> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                max = queue.peek();
                if (max[1] <= j - 3) {
                    list.add(queue.poll());
                } else {
                    break;
                }
            }
            ret[0][j - 2] = grid[max[0]][max[1]];
            for (int[] tar : list) {
                if (tar[0] != 0) {
                    queue.offer(tar);
                }
            }
        }
        for (int i = 3; i < grid.length; i++) {
            for (int j = 0; j < 3; j++) {
                queue.offer(new int[]{i, j});
            }
            List<int[]> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                max = queue.peek();
                if (max[0] <= i - 3) {
                    queue.poll();
                } else if (max[1] > 2) {
                    list.add(queue.poll());
                } else {
                    break;
                }
            }
            ret[i - 2][0] = grid[max[0]][max[1]];
            queue.addAll(list);
            for (int j = 3; j < grid.length; j++) {
                queue.offer(new int[]{i, j});
                list.clear();
                while (!queue.isEmpty()) {
                    max = queue.peek();
                    if (max[0] <= i - 3) {
                        queue.poll();
                    } else if (max[1] <= j - 3 || max[1] > j) {
                        list.add(queue.poll());
                    } else {
                        break;
                    }
                }
                ret[i - 2][j - 2] = grid[max[0]][max[1]];
                queue.addAll(list);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] n = new int[][]{{20, 8, 20, 6, 16, 16, 7, 16, 8, 10}, {12, 15, 13, 10, 20, 9, 6, 18, 17, 6}, {12, 4, 10, 13, 20, 11, 15, 5, 17, 1}, {7, 10, 14, 14, 16, 5, 1, 7, 3, 11}, {16, 2, 9, 15, 9, 8, 6, 1, 7, 15}, {18, 15, 18, 8, 12, 17, 19, 7, 7, 8}, {19, 11, 15, 16, 1, 3, 7, 4, 7, 11}, {11, 6, 5, 14, 12, 18, 3, 20, 14, 6}, {4, 4, 19, 6, 17, 12, 8, 8, 18, 8}, {19, 15, 14, 11, 11, 13, 12, 6, 16, 19}};
        PrintUtil.print(n);
        int[][] ret = largestLocal(n);
        PrintUtil.print(ret);
    }
}
