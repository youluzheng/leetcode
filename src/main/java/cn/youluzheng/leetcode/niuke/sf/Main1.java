package cn.youluzheng.leetcode.niuke.sf;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long count = 1;
        long start = 2;
        long pow = 2;
        while (start * 2 <= n) {
            count += (start * 2 - start) * pow;
            start *= 2;
            pow++;
        }
        count += (n - start + 1) * pow;
        System.out.println(count);
    }
}
