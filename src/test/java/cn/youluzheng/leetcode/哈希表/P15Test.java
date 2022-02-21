package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.api.Test;

class P15Test {

    @Test
    void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        var result = P15.threeSum(nums);
        System.out.println(result);
    }

    @Test
    void threeSum2() {
        int[] nums = {};
        var result = P15.threeSum(nums);
        System.out.println(result);
    }

    @Test
    void threeSum3() {
        int[] nums = {0};
        var result = P15.threeSum(nums);
        System.out.println(result);
    }

    @Test
    void threeSum4() {
        int[] nums = {1, -1, -1, 0};
        var result = P15.threeSum(nums);
        System.out.println(result);
    }

    @Test
    void threeSum5() {
        int[] nums = {0, 0, 0, 0};
        var result = P15.threeSum(nums);
        System.out.println(result);
    }
}