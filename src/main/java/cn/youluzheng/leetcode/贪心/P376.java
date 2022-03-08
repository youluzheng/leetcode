package cn.youluzheng.leetcode.贪心;

public class P376 {
    public int wiggleMaxLength(int[] nums) {
        int count = 1;
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 0) {
                if (flag != 1) {
                    count++;
                    flag = 1;
                }
            } else if (nums[i] - nums[i - 1] < 0) {
                if (flag != -1) {
                    count++;
                    flag = -1;
                }
            }
        }
        return count;
    }
}
