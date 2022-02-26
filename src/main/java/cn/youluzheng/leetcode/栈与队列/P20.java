package cn.youluzheng.leetcode.栈与队列;

import java.util.LinkedList;
import java.util.List;

public class P20 {
    public static boolean isValid(String s) {
        List<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.add(0, ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.remove(0);
            if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
