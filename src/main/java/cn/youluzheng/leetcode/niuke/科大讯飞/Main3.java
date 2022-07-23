package cn.youluzheng.leetcode.niuke.科大讯飞;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

    static void fun(int n, int x, int y, int z, String s, Set set) {
        if (n == 5) {
            set.add(s);
            return;
        }
        for (int i = 0; i <= 4; i++) {
            int actualI = Math.min(i, 10 - x);
            for (int j = 0; j <= 4; j++) {
                int actualJ = Math.min(j, 4 - i);
                int actualK = Math.max(0, 4 - i - actualJ);
                fun(1, i, actualJ, actualK, i + "" + j + "" + actualK, set);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[5];
        for (int i = 0; i < 5; i++) {
            m[i] = in.nextInt();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                int actualJ = Math.min(j, 4 - i);
                int actualK = Math.max(0, 4 - i - actualJ);
                fun(1, i, actualJ, actualK, i + "" + j + "" + actualK, set);
            }
        }
        System.out.println("no yes");
    }
}
