package cn.youluzheng.leetcode.周赛.n301;

import java.util.TreeSet;

public class P6113 {
    static class SmallestInfiniteSet {

        private int min;
        private TreeSet<Integer> set;

        public SmallestInfiniteSet() {
            min = 1;
            set = new TreeSet<>();
        }

        public int popSmallest() {
            if (!set.isEmpty()) {
                return set.pollFirst();
            }
            return min++;
        }

        public void addBack(int num) {
            if (num < min) {
                set.add(num);
            }
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        System.out.println(set.popSmallest());
        System.out.println(set.popSmallest());
        System.out.println(set.popSmallest());
        set.addBack(4);
        System.out.println(set.popSmallest());
        set.addBack(2);
        System.out.println(set.popSmallest());
        System.out.println(set.popSmallest());
    }
}
