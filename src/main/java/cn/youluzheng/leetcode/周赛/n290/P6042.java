package cn.youluzheng.leetcode.周赛.n290;

public class P6042 {

    boolean isIn(int[] circle, int i, int j) {
        return (i - circle[0]) * (i - circle[0]) + (j - circle[1]) * (j - circle[1]) <= circle[2] * circle[2];
    }

    public int countLatticePoints(int[][] circles) {
        int result = 0;
        int minI = Integer.MAX_VALUE;
        int maxI = Integer.MIN_VALUE;
        int minJ = Integer.MAX_VALUE;
        int maxJ = Integer.MIN_VALUE;
        for (int[] ints : circles) {
            minI = Math.min(minI, ints[0] - ints[2]);
            maxI = Math.max(maxI, ints[0] + ints[2]);
            minJ = Math.min(minJ, ints[1] - ints[2]);
            maxJ = Math.max(maxJ, ints[1] + ints[2]);
        }
        for (int i = minI; i <= maxI; i++) {
            for (int j = minJ; j <= maxJ; j++) {
                for (int[] circle : circles) {
                    if (isIn(circle, i, j)) {
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
