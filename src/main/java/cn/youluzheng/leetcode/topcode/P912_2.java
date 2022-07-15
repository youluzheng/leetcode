package cn.youluzheng.leetcode.topcode;

import cn.youluzheng.leetcode.util.PrintUtil;

public class P912_2 {

    void sort(int[] nums, int start, int end) {
        if (start + 1 >= end) {
            return;
        }
        int target = nums[start];
        int i = start;
        int j = end - 1;
        while (i < j) {
            while (j > i && nums[j] >= target) {
                j--;
            }
            if (j == i) {
                break;
            }
            nums[i] = nums[j];
            i++;
            while (i < j && nums[i] <= target) {
                i++;
            }
            if (i == j) {
                break;
            }
            nums[j] = nums[i];
            j--;
        }
        nums[i] = target;
        sort(nums, start, i);
        sort(nums, i + 1, end);
    }

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length);
        return nums;
    }

    public static void main(String[] args) {
        P912_2 p912_2 = new P912_2();
        PrintUtil.print(p912_2.sortArray(new int[]{5, 1, 1, 2, 0, 0}));
    }
}
