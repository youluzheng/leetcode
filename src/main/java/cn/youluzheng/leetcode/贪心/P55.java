package cn.youluzheng.leetcode.贪心;

public class P55 {
    public boolean canJump(int[] nums) {
        int index = 0;

        if (index + nums[index] >= nums.length - 1) {
            return true;
        }
        for (int i = 1; i <= index + nums[index]; i++) {
            if (nums[i] + i > nums[index] + index) {
                index = i;
            }
            if (index + nums[index] >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
