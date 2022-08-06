package cn.youluzheng.leetcode.niuke.nio;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = in.nextInt();
        int offset = 1;
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            String s = in.next();
            if (s.equals("A")) {
                if (flag) {
                    offset++;
                    if (offset > n) {
                        offset = 1;
                    }
                } else {
                    offset--;
                    if (offset == 0) {
                        offset = n;
                    }
                }
            } else {
                if (flag) {
                    offset--;
                    if (offset == 0) {
                        offset = n;
                    }
                } else {
                    offset++;
                    if (offset > n) {
                        offset = 1;
                    }
                }
                flag = !flag;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                System.out.println(offset);
                offset++;
                if (offset > n) {
                    offset = 1;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(offset);
                offset--;
                if (offset == 0) {
                    offset = n;
                }
            }
        }
    }
}
