package cn.youluzheng.leetcode.周赛.n300;

public class P6109 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] count = new long[n + 1];
        count[1] = 1;
        for (int i = 2; i <= n; i++) {
            int min = Math.max(1, i - forget + 1);
            int max = i - delay;
            long sum = 0;
            for (int j = min; j <= max; j++) {
                sum += count[j];
                if (sum > Integer.MAX_VALUE) {
                    sum = sum % 1000000007;
                }
            }
            count[i] = sum;
        }
        int min = Math.max(1, n - forget + 1);
        long sum = 0;
        for (int i = min; i <= n; i++) {
            sum += count[i];
            if (sum > Integer.MAX_VALUE) {
                sum = sum % 1000000007;
            }
        }
        return (int) (sum % (1000000007));
    }

    public static void main(String[] args) {
        int ret = new P6109().peopleAwareOfSecret(684, 18, 496);
        System.out.println(ret);
    }
}
