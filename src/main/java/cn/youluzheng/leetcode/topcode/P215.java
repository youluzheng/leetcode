package cn.youluzheng.leetcode.topcode;

import java.util.PriorityQueue;

public class P215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        int i = 0;
        for (; i < k; i++) {
            queue.add(nums[i]);
        }
        for (; i < nums.length; i++) {
            if (nums[i] > queue.peek()) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }
}
