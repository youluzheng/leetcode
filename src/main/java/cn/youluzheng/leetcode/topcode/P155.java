package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P155 {
    static class MinStack {

        List<Integer> minStack;
        List<Integer> minList;

        public MinStack() {
            minStack = new ArrayList<>();
            minList = new ArrayList<>();
        }

        public void push(int val) {
            minStack.add(val);
            if (minList.size() == 0 || val <= minList.get(minList.size() - 1)) {
                minList.add(val);
            } else {
                minList.add(minList.get(minList.size() - 1));
            }
        }

        public void pop() {
            minStack.remove(minStack.size() - 1);
            minList.remove(minList.size() - 1);
        }

        public int top() {
            return minStack.get(minStack.size() - 1);
        }

        public int getMin() {
            return minList.get(minList.size() - 1);
        }
    }
}
