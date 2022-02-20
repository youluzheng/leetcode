package cn.youluzheng.leetcode.哈希表;

import cn.youluzheng.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

class P1Test {

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actual = P1.twoSum(nums, target);
        PrintUtil.print(actual);
    }

    @Test
    void twoSum2() {
        int[] nums = {3, 3};
        int target = 6;
        int[] actual = P1.twoSum(nums, target);
        PrintUtil.print(actual);
    }
}