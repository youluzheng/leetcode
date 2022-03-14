package cn.youluzheng.leetcode.贪心;

public class P714 {
    public int maxProfit(int[] prices, int fee) {
        int sum = 0;
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            } else if (prices[i] < min || prices[i] + fee < max) {
                if (max - min - fee > 0) {
                    sum += max - min - fee;
                }
                min = prices[i];
                max = prices[i];
            }
        }
        if (max - min - fee > 0) {
            sum += max - min - fee;
        }
        return sum;
    }
}
