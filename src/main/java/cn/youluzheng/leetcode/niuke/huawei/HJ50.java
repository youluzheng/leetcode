package cn.youluzheng.leetcode.niuke.huawei;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class HJ50 {

    static int[] fun(int i, String s) {
        Deque<Character> op = new ArrayDeque<>();
        Deque<Integer> num = new ArrayDeque<>();
        while (i < s.length() && s.charAt(i) != ')') {
            int flag = 1;
            int temp = 0;
            if (s.charAt(i) == '(') {
                int[] ret = fun(i + 1, s);
                i = ret[0];
                temp = ret[1];
            } else {
                if (s.charAt(i) == '-') {
                    flag = -1;
                    i++;
                }
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    temp = temp * 10 + s.charAt(i) - '0';
                    i++;
                }
                temp *= flag;
            }
            if (!op.isEmpty() && op.peek() == '*') {
                temp = num.pop() * temp;
                op.pop();
            } else if (!op.isEmpty() && op.peek() == '/') {
                temp = num.pop() / temp;
                op.pop();
            }
            while (!op.isEmpty() && (i == s.length() || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-')) {
                char ch = op.pop();
                if (ch == '+') {
                    temp = num.pop() + temp;
                } else if (ch == '-') {
                    temp = num.pop() - temp;
                }
            }
            num.push(temp);
            if (i != s.length() && s.charAt(i) != ')') {
                op.push(s.charAt(i));
            } else {
                break;
            }
            i++;
        }
        return new int[]{i + 1, num.pop()};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next().replaceAll("\\[", "(")
                .replaceAll("]", ")")
                .replaceAll("\\{", "(")
                .replaceAll("}", ")");
        int[] ret = HJ50.fun(0, s);
        System.out.println(ret[1]);
    }
}
