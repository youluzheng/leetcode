package cn.youluzheng.leetcode.topcode;

public class P88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int begin = m - 1;
        for (int i = n - 1; i >= 0 && begin >= 0; ) {
            if (nums2[i] <= nums1[begin]) {
                nums1[end] = nums1[begin];
                begin--;
            } else {
                nums1[end] = nums2[i];
                i--;
            }
            end--;
        }
        if (begin < 0) {
            while (end >= 0) {
                nums1[end] = nums2[end];
                end--;
            }
        }
    }
}
