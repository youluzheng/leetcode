package cn.youluzheng.leetcode.niuke.美团;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = (n + 1) / 2;
        int[] m = new int[n];
        Map<Integer, Integer> top = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            int value = top.get(temp) == null ? 0 : top.get(temp);
            if (value + 1 >= k) {
                System.out.println(0);
                return;
            }
            top.put(temp, value + 1);
            m[i] = temp;
        }
        Map<Integer, Integer> all = new HashMap<>(top);
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            if (m[i] != temp) {
                all.put(temp, all.getOrDefault(temp, 0) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int num : all.keySet()) {
            if (all.get(num) >= k) {
                int topCount = top.get(num) == null ? 0 : top.get(num);
                min = Math.min(min, k - topCount);
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
