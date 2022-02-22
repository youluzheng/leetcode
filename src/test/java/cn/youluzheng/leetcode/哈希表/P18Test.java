package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.api.Test;

class P18Test {

    @Test
    void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        var actual = P18.fourSum(nums, target);
        System.out.println(actual);
    }

    @Test
    void fourSum2() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        var actual = P18.fourSum(nums, target);
        System.out.println(actual);
    }
}