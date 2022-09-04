package cn.youluzheng.leetcode.niuke.dd;

import java.util.Scanner;

// 没ac
public class Main2 {

    static int xor(int x) {
        int t = 0;
        while (x != 0) {
            t ^= x % 10;
            x /= 10;
        }
        return t;
    }

    static int count = 0;

    static void dfs(int sum, int max, int ret, int target) {
        for (int i = 0; i < 9; i++) {
            if (sum == 0 && i == 0) {
                if (target == 0) {
                    count++;
                }
                continue;
            }
            sum = sum * 10 + i;
            if (sum > max) {
                return;
            }
            ret = ret ^ i;
            if (ret == target) {
                count++;
            }
            dfs(sum, max, ret, target);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (t[i] > 15) {
                System.out.println("0 ");
                continue;
            }
            dfs(0, r[i], 0, t[i]);
            System.out.print(count + " ");
            count = 0;
        }
    }
}
