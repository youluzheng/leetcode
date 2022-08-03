package cn.youluzheng.leetcode.niuke.huawei;

import java.util.Scanner;

public class HJ55 {

    static boolean fun(int n) {
        if (n % 7 == 0) {
            return true;
        }
        while (n != 0) {
            if (n % 10 == 7) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int i = 7;
        while (i <= n) {
            if (fun(i)) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
