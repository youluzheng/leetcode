package cn.youluzheng.leetcode.niuke.jd;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String str = in.next();
        System.out.println(str.substring(0, k).toUpperCase() + str.substring(k).toLowerCase());
    }
}
