package cn.youluzheng.leetcode.数组;

/**
 * 移除元素
 */
public class P27 {
    public static int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
