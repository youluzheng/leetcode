package cn.youluzheng.leetcode.topcode;

public class P69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double end = 0;
        double start = x / 2.0;
        while (end != start) {
            end = start;
            start = (start + x / start) / 2;
        }
        return (int) end;
    }

    public static void main(String[] args) {
        double a = 1.111111111111111;
        double b = 1.111111111111112;
        System.out.println(a == b);
    }
}
