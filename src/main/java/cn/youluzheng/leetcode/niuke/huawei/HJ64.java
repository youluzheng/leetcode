package cn.youluzheng.leetcode.niuke.huawei;

import java.util.Scanner;

public class HJ64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int top = 1;
        int offset = 0;
        if (n <= 4) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'U') {
                    if (offset == 0) {
                        offset = n - 1;
                    } else {
                        offset--;
                    }
                } else {
                    if (offset == n - 1) {
                        offset = 0;
                    } else {
                        offset++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(i + 1 + " ");
            }
            System.out.println();
            System.out.println(offset + 1);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                if (offset != 0) {
                    offset--;
                } else if (top == 1) {
                    top = n - 3;
                    offset = 3;
                } else {
                    top--;
                }
            } else {
                if (offset != 3) {
                    offset++;
                } else if (top == n - 3) {
                    top = 1;
                    offset = 0;
                } else {
                    top++;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(top + i + " ");
        }
        System.out.println();
        System.out.println(top + offset);
    }
}
