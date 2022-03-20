package cn.youluzheng.leetcode.竞赛.n285;

import java.util.Deque;
import java.util.LinkedList;

public class P6028 {
    public int countCollisions(String directions) {
        Deque<Character> stack = new LinkedList<>();
        char[] chs = directions.toCharArray();
        int result = 0;
        for (int i = 0; i < directions.length(); i++) {
            char ch = directions.charAt(i);
            if (ch == 'R') {
                if (!stack.isEmpty() && stack.peek() == 'S') {
                    stack.clear();
                }
                stack.push(ch);
            } else if (ch == 'S') {
                if (!stack.isEmpty()) {
                    if (stack.pop() == 'R') {
                        result += 1 + stack.size();
                        stack.clear();
                    }
                }
                stack.push(ch);

            } else {
                if (!stack.isEmpty()) {
                    if (stack.pop() == 'S') {
                        result++;
                    } else {
                        result += 2 + stack.size();
                    }
                    stack.clear();
                    stack.push('S');
                }
            }
        }
        return result;
    }
}
