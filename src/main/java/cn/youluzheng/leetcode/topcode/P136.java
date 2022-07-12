package cn.youluzheng.leetcode.topcode;

public class P136 {
    public int singleNumber(int[] nums) {
        int n = nums[0];
        for (int i = 1; i < nums.length; i++) {
            n ^= nums[i];
        }
        return n;
    }
}
