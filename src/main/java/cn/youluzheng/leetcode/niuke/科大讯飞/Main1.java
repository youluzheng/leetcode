package cn.youluzheng.leetcode.niuke.科大讯飞;

import java.util.Scanner;

public class Main1 {

    static int N = 32;

    static int fun(int x, int n) {
        return (int) Math.round(x * 0.5 * (1 - Math.cos(2 * 3.1415927 * n / N)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print(fun(in.nextInt(), i) + " ");
        }
    }
}
