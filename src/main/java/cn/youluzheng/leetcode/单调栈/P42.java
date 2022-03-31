package cn.youluzheng.leetcode.单调栈;

import java.util.Deque;
import java.util.LinkedList;

public class P42 {
    public int trap(int[] height) {
        Deque<Integer> stack = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {
                int value = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                sum += (i - stack.peek() - 1) * (Math.min(height[stack.peek()], height[i]) - height[value]);
            }
            stack.push(i);
        }
        return sum;
    }
}
