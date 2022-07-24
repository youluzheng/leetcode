package cn.youluzheng.leetcode.topcode;

public class P4_3 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int k = sum / 2;
        int i = -1, j = -1;
        while (i < nums1.length - 1 && j < nums2.length - 1 && k != 1) {
            int k2 = k / 2;
            int i1 = Math.min(nums1.length - 1, k2 + i);
            int j1 = Math.min(nums2.length - 1, k2 + j);
            if (nums1[i1] < nums2[j1]) {
                i = i1;
            } else {
                j = j1;
            }
            k = k - k2;
        }
        int m1, m2;
        if (i == nums1.length - 1) {
            if (sum % 2 == 0) {
                m1 = nums2[sum / 2 - nums1.length - 1];
                m2 = nums2[sum / 2 - nums1.length];
            } else {
                m1 = m2 = nums2[sum / 2 - nums1.length];
            }
        } else if (j == nums2.length - 1) {
            if (sum % 2 == 0) {
                m1 = nums1[sum / 2 - nums2.length - 1];
                m2 = nums1[sum / 2 - nums2.length];
            } else {
                m1 = m2 = nums1[sum / 2 - nums2.length];
            }
        } else if (nums1[i + 1] > nums2[j + 1]) {
            m1 = nums2[j + 1];
            if (j + 2 == nums2.length) {
                m2 = nums1[i + 1];
            } else {
                m2 = Math.min(nums1[i + 1], nums2[j + 2]);
            }
        } else {
            m1 = nums1[i + 1];
            if (i + 2 == nums1.length) {
                m2 = nums2[j + 1];
            } else {
                m2 = Math.min(nums1[i + 2], nums2[j + 1]);
            }
        }
        if (sum % 2 == 0) {
            return (m1 + m2) / 2.0;
        }
        return m2;
    }

    public static void main(String[] args) {
        P4_3 p4_3 = new P4_3();
        System.out.println(p4_3.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 7}));
    }
}
