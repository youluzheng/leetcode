package cn.youluzheng.leetcode.hot100;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P11Test {

    @Test
    void testPriorityQueue() {
        int[] height = new int[]{1, 4, 3, 2};
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(x -> height[x]));
        for (int i = 0; i < height.length; i++) {
            queue.offer(i);
        }
        System.out.println(queue);
    }

    @Test
    void maxArea() {
        int[] height = new int[]{4, 4, 2, 11, 0, 11, 5, 11, 13, 8};
        int actual = new P11().maxArea(height);
        assertEquals(55, actual);
    }

}