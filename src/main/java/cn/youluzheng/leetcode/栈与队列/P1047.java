package cn.youluzheng.leetcode.栈与队列;

import java.util.Deque;
import java.util.LinkedList;

public class P1047 {
    public static String removeDuplicates(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.addFirst(s.charAt(i));
            } else {
                if (stack.getFirst() == s.charAt(i)) {
                    stack.removeFirst();
                } else {
                    stack.addFirst(s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }
        return sb.toString();
    }
}
