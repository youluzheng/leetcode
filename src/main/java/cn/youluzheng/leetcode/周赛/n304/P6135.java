package cn.youluzheng.leetcode.周赛.n304;

public class P6135 {
    public int longestCycle(int[] edges) {
        int max = -1;
        int cycle = Integer.MIN_VALUE;
        int[][] set = new int[edges.length][2];
        for (int i = 0; i < edges.length; i++) {
            int count = 0;
            int temp = i;
            while (temp != -1) {
                if (set[temp][0] < cycle) {
                    break;
                }
                if (set[temp][0] == cycle) {
                    max = Math.max(max, count - set[temp][1]);
                    break;
                }
                set[temp][0] = cycle;
                set[temp][1] = count;
                temp = edges[temp];
                count++;
            }
            cycle++;
        }
        return max;
    }

    public static void main(String[] args) {
        P6135 p6135 = new P6135();
        System.out.println(p6135.longestCycle(new int[]{3, 3, 4, 2, 3}));
    }
}
