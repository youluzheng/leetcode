package cn.youluzheng.leetcode.niuke.nio;

import java.util.Scanner;

public class Main4 {
    // 不能ac
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }
        int q = in.nextInt();
        int[] opt = new int[q];
        for (int i = 0; i < q; i++) {
            opt[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int op = opt[i];
            long sum = 0;
            for (int j = 0; j < n; j++) {
                list[j] += op;
                sum += Math.abs(list[j]);
            }
            System.out.println(sum);
        }
    }
}
