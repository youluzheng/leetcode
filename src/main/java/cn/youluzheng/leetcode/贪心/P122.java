package cn.youluzheng.leetcode.贪心;

public class P122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int i = 0, j = 1;
        while (i < prices.length && j < prices.length) {
            if (prices[j] > prices[i]) {
                while (j < prices.length - 1 && prices[j + 1] >= prices[j]) {
                    j++;
                }
                sum += prices[j] - prices[i];
                i = j + 1;
                j = i + 1;
            } else {
                i++;
                j++;
            }
        }
        return sum;
    }
}
