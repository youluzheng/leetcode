package cn.youluzheng.leetcode.topcode;

public class P169 {
    public int majorityElement(int[] nums) {
        int a = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                a = num;
                count++;
            } else {
                if (num == a) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return a;
    }
}
