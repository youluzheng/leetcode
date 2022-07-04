package cn.youluzheng.leetcode.topcode;

import java.util.PriorityQueue;

public class P239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ret = new int[nums.length - k + 1];
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (x, y) -> nums[y] - nums[x]);
        for (int i = 0; i < k; i++) {
            queue.offer(i);
        }
        ret[count++] = nums[queue.peek()];
        for (int i = k; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }
            queue.offer(i);
            ret[count++] = nums[queue.peek()];
        }
        return ret;
    }
}
