package cn.youluzheng.leetcode.单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class P503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, -1);
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums.length * 2; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]) {
                answer[stack.pop()] = nums[i % nums.length];
            }
            if (i < nums.length) {
                stack.push(i);
            }
        }
        return answer;
    }
}
