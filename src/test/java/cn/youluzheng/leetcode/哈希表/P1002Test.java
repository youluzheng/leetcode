package cn.youluzheng.leetcode.哈希表;

import org.junit.jupiter.api.Test;

import java.util.List;

class P1002Test {

    @Test
    void commonChars() {
        String[] words = {"bella", "label", "roller"};
        List<String> actual = P1002.commonChars(words);
        System.out.println(actual);
    }

    @Test
    void commonChars2() {
        String[] words = {"cool", "lock", "cook"};
        List<String> actual = P1002.commonChars(words);
        System.out.println(actual);
    }

    @Test
    void commonChars3() {
        String[] words = {"a", "b", "c"};
        List<String> actual = P1002.commonChars(words);
        System.out.println(actual);
    }
}