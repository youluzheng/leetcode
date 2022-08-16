package cn.youluzheng.leetcode.niuke.zijie;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P1 {

    static int count(char[][] matrix) {
        int ret = 0;
        char[][] newmatrix = new char[matrix.length + 2][matrix[0].length + 2];
        Arrays.fill(newmatrix[0], '0');
        Arrays.fill(newmatrix[newmatrix.length - 1], '0');
        for (int i = 0; i < matrix.length; i++) {
            newmatrix[i + 1][0] = '0';
            newmatrix[i + 1][newmatrix[i].length - 1] = '0';
            System.arraycopy(matrix[i], 0, newmatrix[i + 1], 1, matrix[i].length);
        }
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[i - 1].length; j++) {
                if (newmatrix[i][j] == '1') {
                    deque.offer(new int[]{i, j});
                    newmatrix[i][j] = '0';
                    while (!deque.isEmpty()) {
                        int[] pair = deque.poll();
                        int ii = pair[0];
                        int ij = pair[1];
                        if (newmatrix[ii - 1][ij] == '1') {
                            deque.offer(new int[]{ii - 1, ij});
                            newmatrix[ii - 1][ij] = '0';
                        }
                        if (newmatrix[ii][ij + 1] == '1') {
                            deque.offer(new int[]{ii, ij + 1});
                            newmatrix[ii][ij + 1] = '0';
                        }
                        if (newmatrix[ii + 1][ij] == '1') {
                            deque.offer(new int[]{ii + 1, ij});
                            newmatrix[ii + 1][ij] = '0';
                        }
                        if (newmatrix[ii][ij - 1] == '1') {
                            deque.offer(new int[]{ii, ij - 1});
                            newmatrix[ii][ij - 1] = '0';
                        }
                    }
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (char) in.nextInt();
            }
        }
        int ret = count(matrix);
        System.out.println(ret);
    }
}
