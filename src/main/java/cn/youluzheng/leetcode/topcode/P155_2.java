package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P155_2 {
    class MinStack {

        List<Integer> stack;
        List<Integer> minStack;

        public MinStack() {
            stack = new ArrayList<>();
            minStack = new ArrayList<>();
        }

        public void push(int val) {
            stack.add(val);
            if (minStack.isEmpty()) {
                minStack.add(0);
            } else if (val < stack.get(minStack.get(minStack.size() - 1))) {
                minStack.add(stack.size() - 1);
            }
        }

        public void pop() {
            if (minStack.get(minStack.size() - 1) == stack.size() - 1) {
                minStack.remove(minStack.size() - 1);
            }
            stack.remove(stack.size() - 1);
        }

        public int top() {
            return stack.get(stack.size() - 1);
        }

        public int getMin() {
            return stack.get(minStack.get(minStack.size() - 1));
        }
    }
}
