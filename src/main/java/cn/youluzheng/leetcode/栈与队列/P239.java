package cn.youluzheng.leetcode.栈与队列;

import java.util.Deque;
import java.util.LinkedList;

public class P239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> stack = new LinkedList<>();
        // 解决区间内排序问题
        for (int i = 0; i < k - 1; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
        }
        for (int i = k - 1; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            result[i - k + 1] = nums[stack.getLast()];
            if (stack.getLast() == i - k + 1) {
                stack.removeLast();
            }
        }
        return result;
    }
}
