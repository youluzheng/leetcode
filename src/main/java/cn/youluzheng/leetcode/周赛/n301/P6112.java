package cn.youluzheng.leetcode.周赛.n301;

import java.util.PriorityQueue;

public class P6112 {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(amount.length, (x, y) -> Integer.compare(y, x));
        for (int value : amount) {
            if (value != 0) {
                queue.offer(value);
            }
        }
        int count = 0;
        while (queue.size() > 1) {
            int v1 = queue.poll();
            int v2 = queue.poll();
            count++;
            if (v1 - 1 != 0) {
                queue.offer(v1 - 1);
            }
            if (v2 - 1 != 0) {
                queue.offer(v2 - 1);
            }
        }
        if (queue.size() == 0) {
            return count;
        } else {
            return queue.peek() + count;
        }
    }

    public static void main(String[] args) {
        P6112 p4112 = new P6112();
        System.out.println(p4112.fillCups(new int[]{1, 4, 2}));
    }
}
