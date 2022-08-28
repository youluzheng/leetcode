package cn.youluzheng.leetcode.周赛.n308;

import cn.youluzheng.leetcode.util.PrintUtil;

import java.util.*;

public class P6163 {

    List<Integer> sort(int[][] target) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] countN = new int[target.length];
        for (int i = 0; i < target.length; i++) {
            for (int[] ints : target) {
                if (ints[i] == 1) {
                    countN[i]++;
                }
            }
            if (countN[i] == 0) {
                queue.offer(i);
            }
        }
        if (queue.isEmpty()) {
            return null;
        }
        List<Integer> ret = new ArrayList<>();
        while (!queue.isEmpty()) {
            int value = queue.pop();
            ret.add(value);
            for (int i = 0; i < target.length; i++) {
                if (target[value][i] == 1) {
                    countN[i]--;
                    if (countN[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }
        if (ret.size() != target.length) {
            return null;
        }
        return ret;
    }

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[][] ret = new int[k][k];
        int[][] upDown = new int[k][k];
        for (int i = 0; i < rowConditions.length; i++) {
            int[] row = rowConditions[i];
            upDown[row[0] - 1][row[1] - 1] = 1;
        }
        List<Integer> ret1 = sort(upDown);
        if (ret1 == null) {
            return new int[][]{};
        }
        int[][] leftRight = new int[k][k];
        for (int i = 0; i < colConditions.length; i++) {
            int[] col = colConditions[i];
            leftRight[col[0] - 1][col[1] - 1] = 1;
        }
        List<Integer> ret2 = sort(leftRight);
        if (ret2 == null) {
            return new int[][]{};
        }
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < ret1.size(); i++) {
            map.put(ret1.get(i), new int[]{i, 0});
        }
        for (int i = 0; i < ret2.size(); i++) {
            map.get(ret2.get(i))[1] = i;
        }
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] value = entry.getValue();
            ret[value[0]][value[1]] = entry.getKey() + 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] ret = new P6163().buildMatrix(3, new int[][]{{1, 2}, {3, 2}}, new int[][]{{2, 1}, {3, 2}});
        PrintUtil.print(ret);
    }
}
