package cn.youluzheng.leetcode.hot100;

public class P4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean flag = (nums1.length + nums2.length) % 2 == 0;
        int start = (nums1.length + nums2.length + 1) / 2;
        double sum = 0;
        int i = 0, j = 0, index = 1;
        while (i < nums1.length && j < nums2.length) {
            int min;
            if (nums1[i] <= nums2[j]) {
                min = nums1[i];
                i++;
            } else {
                min = nums2[j];
                j++;
            }
            if (index >= start) {
                if (!flag) {
                    return min;
                }
                if (index != start) {
                    return (sum + min) / 2;
                }
                sum += min;
            }
            index++;
        }
        if (i == nums1.length) {
            i = j;
            nums1 = nums2;
        }
        while (i < nums1.length) {
            if (index >= start) {
                if (!flag) {
                    return nums1[i];
                }
                if (index != start) {
                    return (sum + nums1[i]) / 2;
                }
                sum += nums1[i];
            }
            i++;
            index++;
        }
        return sum;
    }
}
