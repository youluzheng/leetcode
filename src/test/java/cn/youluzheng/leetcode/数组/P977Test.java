package cn.youluzheng.leetcode.数组;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P977Test {

    boolean isSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    void sortedSquares() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] actual = P977.sortedSquares(nums);
        for (int v : actual) {
            System.out.print(v + ", ");
        }
        System.out.println();
        assertTrue(this.isSort(actual));
    }

    @Test
    void sortedSquares2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] actual = P977.sortedSquares(nums);
        for (int v : actual) {
            System.out.print(v + ", ");
        }
        System.out.println();
        assertTrue(this.isSort(actual));
    }

    @Test
    void sortedSquares3() {
        int[] nums = {-7, -3, -2, -1, 0};
        int[] actual = P977.sortedSquares(nums);
        for (int v : actual) {
            System.out.print(v + ", ");
        }
        System.out.println();
        assertTrue(this.isSort(actual));
    }

    @Test
    void sortedSquares4() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] actual = P977.sortedSquares(nums);
        for (int v : actual) {
            System.out.print(v + ", ");
        }
        System.out.println();
        assertTrue(this.isSort(actual));
    }
}