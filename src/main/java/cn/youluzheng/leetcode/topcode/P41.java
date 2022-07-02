package cn.youluzheng.leetcode.topcode;

public class P41 {
    public int firstMissingPositive(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            while (true) {
                if (temp > nums.length || temp <= 0) {
                    break;
                }
                if (nums[temp - 1] == temp) {
                    break;
                }
                int temp2 = nums[temp - 1];
                nums[temp - 1] = temp;
                temp = temp2;
            }
        }
        int i = 0;
        for (; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                break;
            }
        }
        return i + 1;
    }
}
