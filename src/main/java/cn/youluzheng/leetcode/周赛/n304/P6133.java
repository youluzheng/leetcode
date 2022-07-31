package cn.youluzheng.leetcode.周赛.n304;

public class P6133 {
    public int maximumGroups(int[] grades) {
        int n = 0;
        int sum = 0;
        while (grades.length >= sum) {
            n++;
            sum += n;
        }
        return n - 1;
    }

    public static void main(String[] args) {
        P6133 p6133 = new P6133();
        System.out.println(p6133.maximumGroups(new int[]{10, 6, 12, 7, 3, 5, 1, 1, 1, 1}));
    }
}
