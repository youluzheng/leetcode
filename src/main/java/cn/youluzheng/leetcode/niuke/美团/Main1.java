package cn.youluzheng.leetcode.niuke.美团;

import java.util.Scanner;

public class Main1 {

    static int fun2(int x, int y) {
        return Math.min((x + y) / 3, Math.min(x, y));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(fun2(x, y));
        }
    }
}
