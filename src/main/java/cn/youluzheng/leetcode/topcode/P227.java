package cn.youluzheng.leetcode.topcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P227 {
    public int calculate(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<Character> charStack = new ArrayDeque<>();
        int index = 0;
        while (index < s.length()) {
            int num = 0;
            while (index < s.length() && (s.charAt(index) >= '0' && s.charAt(index) <= '9'
                    || s.charAt(index) == ' ')) {
                if (s.charAt(index) != ' ') {
                    num = num * 10 + s.charAt(index) - '0';
                }
                index++;
            }
            if (index == s.length()) {
                numStack.push(num);
                break;
            }
            if (!charStack.isEmpty()) {
                if (s.charAt(index) == '+' || s.charAt(index) == '-') {
                    while (!charStack.isEmpty()) {
                        if (charStack.peek() == '+') {
                            num = numStack.pop() + num;
                        } else if (charStack.peek() == '-') {
                            num = numStack.pop() - num;
                        } else if (charStack.peek() == '*') {
                            num = numStack.pop() * num;
                        } else if (charStack.peek() == '/') {
                            num = numStack.pop() / num;
                        }
                        charStack.pop();
                    }
                } else if (s.charAt(index) == '*' || s.charAt(index) == '/') {
                    if (charStack.peek() == '*') {
                        num = numStack.pop() * num;
                        charStack.pop();
                    } else if (charStack.peek() == '/') {
                        num = numStack.pop() / num;
                        charStack.pop();
                    }
                }
            }
            numStack.push(num);
            charStack.push(s.charAt(index));
            index++;
        }
        while (!charStack.isEmpty()) {
            int n1 = numStack.pop();
            int n2 = numStack.pop();
            char ch = charStack.pop();
            if (ch == '+') {
                numStack.push(n2 + n1);
            } else if (ch == '-') {
                numStack.push(n2 - n1);
            } else if (ch == '*') {
                numStack.push(n2 * n1);
            } else if (ch == '/') {
                numStack.push(n2 / n1);
            }
        }
        return numStack.pop();
    }

    public static void main(String[] args) {
        P227 p227 = new P227();
        System.out.println(p227.calculate(" 3/2 ")); // 1
        System.out.println(p227.calculate("1+2*3+4")); // 11
        System.out.println(p227.calculate("1+2")); // 3
        System.out.println(p227.calculate("1+2+3+4")); // 10
        System.out.println(p227.calculate("1+2*3+4/2")); // 9
        System.out.println(p227.calculate("1*2+2*3+4/2")); // 10
        System.out.println(p227.calculate("1*2-3/4+5*6-7*8+9/10")); // -24
    }
}
