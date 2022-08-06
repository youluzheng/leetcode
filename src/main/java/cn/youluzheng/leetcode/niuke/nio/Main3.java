package cn.youluzheng.leetcode.niuke.nio;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Deque<String> stack = new ArrayDeque<>();
        int i = 0;
        while (i < str.length()) {
            boolean isEnd = false;
            StringBuilder sb = new StringBuilder();
            if (str.charAt(i) != '<') {
                System.out.println("NO");
                return;
            }
            i++;
            if (i == str.length()) {
                System.out.println("NO");
                return;
            }
            if (str.charAt(i) == '/') {
                isEnd = true;
                i++;
                if (i == str.length()) {
                    System.out.println("NO");
                    return;
                }
            } else if (str.charAt(i) == '>') {
                System.out.println("NO");
                return;
            }
            while (i < str.length() && str.charAt(i) != '>') {
                if (str.charAt(i) == '<' || str.charAt(i) == '/') {
                    System.out.println("NO");
                    return;
                }
                sb.append(str.charAt(i));
                i++;
            }
            if (i == str.length()) {
                System.out.println("NO");
                return;
            }
            if (isEnd) {
                if (stack.isEmpty() || !stack.pop().equals(sb.toString())) {
                    System.out.println("NO");
                    return;
                }
            } else {
                stack.push(sb.toString());
            }
            i++;
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
