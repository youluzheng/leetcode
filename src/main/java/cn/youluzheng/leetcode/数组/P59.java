package cn.youluzheng.leetcode.数组;

/**
 * 螺旋矩阵
 */
public class P59 {
    public static int[][] generateMatrix(int n) {
        int r = -1;
        int c = -1;
        // 左开右开，上开下开
        int l_limit = -1;
        int r_limit = n;
        int u_limit = -1;
        int d_limit = n;
        int count = 1;
        int[][] result = new int[n][n];
        while (count <= n * n) {
            for (r++, c++; c < r_limit; c++) {
                result[r][c] = count++;
            }
            u_limit++;
            for (r++, c--; r < d_limit; r++) {
                result[r][c] = count++;
            }
            r_limit--;
            for (c--, r--; c > l_limit; c--) {
                result[r][c] = count++;
            }
            d_limit--;
            for (r--, c++; r > u_limit; r--) {
                result[r][c] = count++;
            }
            l_limit++;
        }
        return result;
    }
}
