package cn.youluzheng.leetcode.周赛.n306;

public class P6149 {
    public static int edgeScore(int[] edges) {
        long[] ret = new long[edges.length];
        for (int i = 0; i < edges.length; i++) {
            ret[edges[i]] += i;
        }
        long max = 0;
        int index = 0;
        for (int i = ret.length - 1; i >= 0; i--) {
            if (ret[i] >= max) {
                max = ret[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int ret = P6149.edgeScore(new int[]{1, 0});
        System.out.println(ret);
    }
}
