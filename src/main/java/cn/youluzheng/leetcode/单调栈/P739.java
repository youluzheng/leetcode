package cn.youluzheng.leetcode.单调栈;

import java.util.Deque;
import java.util.LinkedList;

public class P739 {
    public int[] dailyTemperature(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                while (!stack.isEmpty()) {
                    if (temperatures[stack.peek()] < temperatures[i]) {
                        int index = stack.pop();
                        answer[index] = i - index;
                    } else {
                        break;
                    }
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.pop()] = 0;
        }
        return answer;
    }
}
