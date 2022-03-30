package cn.youluzheng.leetcode.单调栈;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class P496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
                while (!stack.isEmpty()) {
                    if (nums2[stack.peek()] < nums2[i]) {
                        map.put(nums2[stack.pop()], nums2[i]);
                    } else {
                        break;
                    }
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            map.put(nums2[stack.pop()], -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            answer[i] = map.get(nums1[i]);
        }
        return answer;
    }
}
