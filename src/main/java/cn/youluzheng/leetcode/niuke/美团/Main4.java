package cn.youluzheng.leetcode.niuke.美团;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] m = new int[n];
        int[] count = new int[k];
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            m[i] = temp;
            count[temp - 1]++;
        }
        for (int i = 0; i < k; i++) {
            count[i] = (count[i] + 1) / 2;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (count[m[i] - 1] != 0) {
                System.out.print(i + 1 + " ");
                count[m[i] - 1]--;
            } else {
                list.add(i + 1);
            }
        }
        System.out.println();
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
