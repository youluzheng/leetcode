package cn.youluzheng.leetcode.niuke.jd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 6
// 1 1 4 5 1 4
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            m[i] = in.nextInt();
            if (i % 2 == 0) {
                map2.put(m[i], map2.getOrDefault(m[i], 0) + 1);
                count2++;
            } else {
                map1.put(m[i], map1.getOrDefault(m[i], 0) + 1);
                count1++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int value = count1 - entry.getValue();
            for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
                int value2;
                if (entry2.getKey().intValue() == entry.getKey()) {
                    value2 = count2;
                } else {
                    value2 = count2 - entry2.getValue();
                }
                min = Math.min(min, value + value2);
            }
        }
        System.out.println(min);
    }
}
