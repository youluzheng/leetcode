package cn.youluzheng.leetcode.hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class P42 {
    public int trap(int[] height) {
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int top = stack.pop();
                if (stack.size() == 0) {
                    break;
                }
                sum += (Math.min(height[i], height[stack.peek()]) - height[top]) * (i - stack.peek() - 1);
            }
            stack.push(i);
        }
        return sum;
    }
}
