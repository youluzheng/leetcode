package cn.youluzheng.leetcode.hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class P20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()
                        || ch == ')' && stack.pop() != '('
                        || ch == ']' && stack.pop() != '['
                        || ch == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
