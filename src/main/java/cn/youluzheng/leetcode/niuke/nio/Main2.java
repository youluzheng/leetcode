package cn.youluzheng.leetcode.niuke.nio;

import java.util.Scanner;

public class Main2 {
    // 没过
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] dp = new int[n][k + 1];
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        for (int i = 0; i <= k; i++) {
            if (i < c[0]) {
                dp[0][i] = a[0];
            } else {
                dp[0][i] = b[0];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j < c[i]) {
                    dp[i][j] = dp[i - 1][j] + a[i];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - c[i]] + b[i], dp[i - 1][j] + a[i]);
                }
            }
        }
        System.out.println(1500 + dp[n - 1][k]);
    }
}
