package cn.youluzheng.leetcode.niuke.nio;

import java.util.Scanner;

public class Main1 {

    static int fun2(int x, int y) {
        if (y == 0) {
            return x;
        }
        return fun2(y, x % y);
    }

    static void fun(int x, int y) {
        int max = Math.max(x, y);
        int n = fun2(x, y);
        int result = max / n;
        if (result % 2 == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            fun(in.nextInt(), in.nextInt());
        }
    }
}
