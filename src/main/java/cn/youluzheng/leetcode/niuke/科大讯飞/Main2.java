package cn.youluzheng.leetcode.niuke.科大讯飞;

import java.util.*;

public class Main2 {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static int calPowDis(Point p1, Point p2) {
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }

    static boolean isTarget(int l1, int l2, int l3) {
        return l1 + l2 == l3 || l1 + l3 == l2 || l2 + l3 == l1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Point> set = new HashSet<>();
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            set.add(new Point(in.nextInt(), in.nextInt()));
        }
        List<Point> list = new ArrayList<>(set);
        N = list.size();
        int ret = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int l1 = calPowDis(list.get(i), list.get(j));
                for (int k = j + 1; k < N; k++) {
                    int l2 = calPowDis(list.get(i), list.get(k));
                    int l3 = calPowDis(list.get(j), list.get(k));
                    if (isTarget(l1, l2, l3)) {
                        ret++;
                    }
                }
            }
        }
        System.out.println(ret);
    }
}
