package cn.youluzheng.leetcode.栈与队列;

import java.util.LinkedList;
import java.util.List;

public class P225 {
    static class MyStack {

        List<Integer> list;

        public MyStack() {
            list = new LinkedList<>();
        }

        public void push(int x) {
            list.add(x);
        }

        public int pop() {
            for (int i = 0; i < list.size() - 1; i++) {
                list.add(list.remove(0));
            }
            return list.remove(0);
        }

        public int top() {
            for (int i = 0; i < list.size() - 1; i++) {
                list.add(list.remove(0));
            }
            int e = list.get(0);
            list.add(list.remove(0));
            return e;
        }

        public boolean empty() {
            return list.isEmpty();
        }
    }
}
