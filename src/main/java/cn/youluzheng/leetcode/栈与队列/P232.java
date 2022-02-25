package cn.youluzheng.leetcode.栈与队列;

import java.util.ArrayList;
import java.util.List;

public class P232 {
    static class MyQueue {
        List<Integer> list1;
        List<Integer> list2;

        public MyQueue() {
            list1 = new ArrayList<>();
            list2 = new ArrayList<>();
        }

        public void push(int x) {
            list1.add(0, x);
        }

        public int pop() {
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.add(0, list1.remove(0));
                }
            }
            return list2.remove(0);
        }

        public int peek() {
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.add(0, list1.remove(0));
                }
            }
            return list2.get(0);
        }

        public boolean empty() {
            return list1.isEmpty() && list2.isEmpty();
        }
    }
}
