package cn.youluzheng.leetcode.topcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P42 {
    public int trap(int[] height) {
        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()) {
                if (height[i] > height[stack.peek()]) {
                    int mid = stack.pop();
                    if (stack.size() == 0) {
                        break;
                    } else {
                        max += (Math.min(height[stack.peek()], height[i]) - height[mid]) * (i - stack.peek() - 1);
                    }
                } else if (height[i] == height[stack.peek()]) {
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return max;
    }
}
