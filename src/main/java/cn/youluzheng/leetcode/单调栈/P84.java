package cn.youluzheng.leetcode.单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class P84 {
    public int largestRectangleArea(int[] heights) {
        List<Integer> list = Arrays.stream(heights).boxed().collect(Collectors.toList());
        list.add(0, 0);
        list.add(0);
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        int max = 0;
        for (int i = 1; i < list.size(); i++) {
            while (list.get(stack.peek()) > list.get(i)) {
                int h = list.get(stack.pop());
                int left = stack.peek();
                max = Math.max(max, (i - left - 1) * h);
            }
            stack.push(i);
        }
        return max;
    }
}
