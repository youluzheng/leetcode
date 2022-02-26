package cn.youluzheng.leetcode.栈与队列;

import java.util.Deque;
import java.util.LinkedList;

public class P150 {
    public static int evalRPN(String[] tokens) {
        Deque<String> stack = new LinkedList<>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    stack.push(String.valueOf(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
                    break;
                case "-":
                    stack.push(String.valueOf(-Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
                    break;
                case "*":
                    stack.push(String.valueOf(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop())));
                    break;
                case "/":
                    int p2 = Integer.parseInt(stack.pop());
                    int p1 = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(p1 / p2));
                    break;
                default:
                    stack.push(s);
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
