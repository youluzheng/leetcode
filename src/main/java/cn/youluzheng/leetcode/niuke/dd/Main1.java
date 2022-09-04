package cn.youluzheng.leetcode.niuke.dd;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        Arrays.sort(w);
        int max = 1;
        int left = n - 1;
        int right = n - 1;
        long sum = 0;
        while (left >= 0) {
            sum += w[left];
            while (right >= left && k * sum < (long) (right - left + 1) * w[right]) {
                sum -= w[right];
                right--;
            }
            max = Math.max(max, right - left + 1);
            left--;
        }
        System.out.println(max);
    }
}
