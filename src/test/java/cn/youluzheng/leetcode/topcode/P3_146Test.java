package cn.youluzheng.leetcode.topcode;

import org.junit.jupiter.api.Test;

class P3_146Test {
    @Test
    void test() {
        P146.LRUCache cache = new P146.LRUCache(2);
        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }

}