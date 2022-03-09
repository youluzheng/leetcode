package cn.youluzheng.leetcode.贪心;

public class P45 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int i = 0;
        int index = 0;
        int count = 1;

        while (i < nums.length) {
            if (nums[index] + index >= nums.length - 1) {
                return count;
            }
            int temp = index;
            while (i <= nums[index] + index) {
                if (nums[i] + i > nums[temp] + temp) {
                    temp = i;
                }
                i++;
            }
            index = temp;
            count++;
        }
        return -1;
    }
}
