package cn.youluzheng.leetcode.回溯;

import org.junit.jupiter.api.Test;

class P491Test {

    @Test
    void findSubsequences() {
        var actual = new P491()
                .findSubsequences(new int[]{1, 2, 3, 1, 1, 1});
        System.out.println(actual);
    }
}