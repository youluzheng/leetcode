package cn.youluzheng.leetcode.hot100;

public class P75 {
    public void sortColors(int[] nums) {
        int index0 = 0;
        int index2 = nums.length - 1;
        while (index0 < nums.length && nums[index0] == 0) {
            index0++;
        }
        while (index2 >= 0 && nums[index2] == 2) {
            index2--;
        }
        for (int i = index0; i <= index2; ) {
            if (nums[i] == 0) {
                nums[i] = nums[index0];
                nums[index0] = 0;
                while (index0 < nums.length && nums[index0] == 0) {
                    index0++;
                }
                i = index0;
            } else if (nums[i] == 2) {
                nums[i] = nums[index2];
                nums[index2] = 2;
                while (index2 >= 0 && nums[index2] == 2) {
                    index2--;
                }
            } else {
                i++;
            }
        }
    }
}
