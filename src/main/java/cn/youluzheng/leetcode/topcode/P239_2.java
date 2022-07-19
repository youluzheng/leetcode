package cn.youluzheng.leetcode.topcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P239_2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ret = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty()) {
                if (nums[i] >= nums[deque.getLast()]) {
                    deque.removeLast();
                } else {
                    break;
                }
            }
            deque.addLast(i);
            if (i >= k - 1) {
                while (deque.getFirst() <= i - k) {
                    deque.removeFirst();
                }
                ret[i - k + 1] = nums[deque.getFirst()];
            }
        }
        return ret;
    }
}
