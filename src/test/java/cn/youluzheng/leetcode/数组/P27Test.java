package cn.youluzheng.leetcode.数组;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P27Test {

    boolean isContain(List<Integer> element, int[] target, int length) {
        Map<Integer, Integer> map = new HashMap<>();
        element.forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));
        for (int i = 0; i < length; i++) {
            if (map.containsKey(target[i])) {
                map.put(target[i], map.get(target[i]) - 1);
            } else {
                return false;
            }
        }
        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    void removeElement() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(2, actual);
        assertTrue(this.isContain(List.of(2, 2), nums, 2));
    }

    @Test
    void removeElement2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(5, actual);
        assertTrue(this.isContain(List.of(0, 1, 4, 0, 3), nums, 5));
    }

    @Test
    void removeElement3() {
        int[] nums = {0};
        int val = 0;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(0, actual);
        assertTrue(this.isContain(List.of(), nums, 0));
    }

    @Test
    void removeElement4() {
        int[] nums = {0};
        int val = 1;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(1, actual);
        assertTrue(this.isContain(List.of(0), nums, 1));
    }

    @Test
    void removeElement5() {
        int[] nums = {0, 0, 0, 0};
        int val = 0;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(0, actual);
        assertTrue(this.isContain(List.of(), nums, 0));
    }

    @Test
    void removeElement6() {
        int[] nums = {1, 0, 0, 0};
        int val = 0;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(1, actual);
        assertTrue(this.isContain(List.of(1), nums, 1));
    }

    @Test
    void removeElement7() {
        int[] nums = {0, 0, 0, 1};
        int val = 0;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(1, actual);
        assertTrue(this.isContain(List.of(1), nums, 1));
    }

    @Test
    void removeElement8() {
        int[] nums = {};
        int val = 0;
        int actual = P27.removeElement(nums, val);
        for (int v : nums) {
            System.out.print(v + ", ");
        }
        assertEquals(0, actual);
        assertTrue(this.isContain(List.of(), nums, 0));
    }
}