package cn.youluzheng.leetcode.niuke.jd;

import java.util.Scanner;

// no ac
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 6) {
            System.out.println(0);
            return;
        } else if (n == 6) {
            System.out.println(1);
            return;
        }
        long k = n - 4;
        long count = k * (k - 1) / 2;
        for (int i = 0; i < k - 2; i++) {
            count = count * 26 % 1000000007;
        }
        System.out.println(count);
    }
}
