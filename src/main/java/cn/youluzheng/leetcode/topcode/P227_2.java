package cn.youluzheng.leetcode.topcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P227_2 {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Character> op = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            while (i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == ' ')) {
                if (s.charAt(i) != ' ') {
                    temp = temp * 10 + s.charAt(i) - '0';
                }
                i++;
            }
            while (!op.isEmpty()) {
                if (op.peek() == '*') {
                    op.pop();
                    temp = stack.pop() * temp;
                } else if (op.peek() == '/') {
                    op.pop();
                    temp = stack.pop() / temp;
                } else {
                    break;
                }
            }
            if (i == s.length() || s.charAt(i) == '+' || s.charAt(i) == '-') {
                while (!op.isEmpty()) {
                    if (op.peek() == '+') {
                        op.pop();
                        temp = stack.pop() + temp;
                    } else if (op.peek() == '-') {
                        op.pop();
                        temp = stack.pop() - temp;
                    } else {
                        break;
                    }
                }
            }
            stack.push(temp);
            if (i != s.length()) {
                op.push(s.charAt(i));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        P227_2 p227_2 = new P227_2();
        System.out.println(p227_2.calculate("1+ 2"));
        System.out.println(p227_2.calculate("1+2*3"));
        System.out.println(p227_2.calculate("1+2*3+4"));
    }
}
