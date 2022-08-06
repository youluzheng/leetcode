package cn.youluzheng.leetcode.niuke.美团;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        int[][] k = new int[n + 1][2];
        k[0][0] = 0;
        k[n][1] = 0;
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            m[i] = temp;
            k[i + 1][0] = k[i][0];
            if (temp >= 0) {
                k[i + 1][0]++;
            }
        }
        int min = n;
        for (int i = n - 1; i >= 0; i--) {
            k[i][1] = k[i + 1][1];
            if (m[i] <= 0) {
                k[i][1]++;
            }
            min = Math.min(min, k[i][0] + k[i][1]);
        }
        System.out.println(min);
    }
}
