package cn.youluzheng.leetcode.贪心;

public class P135 {
    public int candy(int[] ratings) {
        int count = ratings.length;
        int[] help = new int[ratings.length];
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                help[i] = help[i - 1] + 1;
            } else if (ratings[i] < ratings[i - 1]) {
                if (help[i - 1] == 0) {
                    for (int j = i; j > 0 && ratings[j] < ratings[j - 1]; j--) {
                        if (help[j] == help[j - 1]) {
                            help[j - 1]++;
                        }
                    }
                }
            }
        }
        for (int var : help) {
            count += var;
        }
        return count;
    }

    public int candy2(int[] ratings) {
        int count = ratings.length;
        int high;
        int low;
        int i = 1;
        while (i < ratings.length) {
            for (high = 0; i < ratings.length && ratings[i] > ratings[i - 1]; i++) {
                high++;
            }
            for (low = 0; i < ratings.length && ratings[i] < ratings[i - 1]; i++) {
                low++;
            }
            int max = Math.max(high, low);
            int min = Math.min(high, low);
            count += max * (max + 1) / 2;
            if (min > 1) {
                count += min * (min - 1) / 2;
            }
            for (; i < ratings.length && ratings[i] == ratings[i - 1]; i++) ;
        }
        return count;
    }
}
