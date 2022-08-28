package cn.youluzheng.leetcode.周赛.n308;

import java.util.ArrayDeque;
import java.util.Deque;

public class P6161 {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                queue.removeLast();
            } else {
                queue.add(s.charAt(i));
            }
        }
        while (!queue.isEmpty()) {
            sb.append(queue.pop());
        }
        return sb.toString();
    }
}
