package cn.youluzheng.leetcode.topcode;

import java.util.Random;

public class P470 {
    public int rand7() {
        return new Random().nextInt(7) + 1;
    }

    public int rand10() {
        int value = rand7();
        while (value == 6 || value == 7) {
            value = rand7();
        }
        int value2 = rand7();
        while (value2 == 4) {
            value2 = rand7();
        }
        if (value2 < 4) {
            value2 = -1;
        } else {
            value2 = 0;
        }
        return value * 2 + value2;
    }

    public static void main(String[] args) {
        P470 p = new P470();
        int[] map = new int[11];
        for (int i = 1; i <= 10000000; i++) {
            map[p.rand10()]++;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ":" + map[i]);
        }
    }
}
