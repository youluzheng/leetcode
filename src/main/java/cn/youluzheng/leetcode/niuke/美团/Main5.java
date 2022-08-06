package cn.youluzheng.leetcode.niuke.美团;

import java.util.Scanner;

public class Main5 {

    static char[] wow = new char[]{'w', 'o', 'w'};
    static char[] meiTuan = new char[]{'M', 'e', 'i', 'T', 'u', 'a', 'n'};

    static long[] fun() {
        long[] n = new long[58];
        long ret = 7;
        for (int i = 0; i < 58; i++) {
            n[i] = ret;
            ret = 2 * ret + 3;
        }
        return n;
    }

    // MeiTuan
    // wow
    static Character fun2(long temp, long k) {
        if (temp <= 7) {
            return meiTuan[(int) temp - 1];
        }
        if (k - temp < 3) {
            return wow[2 - (int) (k - temp)];
        }
        long mid = (k - 3) / 2;
        // 如果在前面半边
        if (temp <= mid) {
            return fun2(temp, mid);
        } else {
            return fun2(k - 2 - temp, mid);
        }
    }

    public static void main(String[] args) {
        long[] m = fun();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long temp = in.nextLong();
            for (int j = 0; j < m.length; j++) {
                if (temp <= m[j]) {
                    System.out.println(fun2(temp, m[j]));
                    break;
                }
            }
        }
    }
}
