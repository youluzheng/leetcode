package cn.youluzheng.leetcode.周赛.n308;

import java.util.Arrays;

public class P6160 {


    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int sum = 0;
            for (int k : nums) {
                if (sum + k > queries[i]) {
                    break;
                }
                sum += k;
                count++;
            }
            ret[i] = count;
        }
        return ret;
    }
}
