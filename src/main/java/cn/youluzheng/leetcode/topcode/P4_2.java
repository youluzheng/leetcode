package cn.youluzheng.leetcode.topcode;

public class P4_2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = (nums1.length + nums2.length) / 2;
        int i = -1, j = -1;
        while (i < nums1.length - 1 && j < nums2.length - 1 && k != 1) {
            int k2 = k / 2;
            int n1 = Math.min(i + k2, nums1.length - 1);
            int n2 = Math.min(j + k2, nums2.length - 1);
            if (nums1[n1] <= nums2[n2]) {
                i = n1;
            } else {
                j = n2;
            }
            k = k - k2;
        }
        int sum = (nums1.length + nums2.length);
        if (sum % 2 == 0) {
            if (i == nums1.length - 1) {
                return (nums2[sum / 2 - nums1.length - 1] + nums2[sum / 2 - nums1.length]) / 2.0;
            } else if (j == nums2.length - 1) {
                return (nums1[sum / 2 - nums2.length - 1] + nums1[sum / 2 - nums2.length]) / 2.0;
            } else {
                int m1, m2;
                if (nums1[i + 1] < nums2[j + 1]) {
                    m1 = nums1[i + 1];
                    if (i + 1 == nums1.length - 1) {
                        m2 = nums2[j + 1];
                    } else {
                        m2 = Math.min(nums1[i + 2], nums2[j + 1]);
                    }
                } else {
                    m1 = nums2[j + 1];
                    if (j + 1 == nums2.length - 1) {
                        m2 = nums1[i + 1];
                    } else {
                        m2 = Math.min(nums2[j + 2], nums1[i + 1]);
                    }
                }
                return (m1 + m2) / 2.0;
            }
        } else {
            if (i == nums1.length - 1) {
                return nums2[sum / 2 - nums1.length];
            } else if (j == nums2.length - 1) {
                return nums1[sum / 2 - nums2.length];
            } else {
                if (nums1[i + 1] <= nums2[j + 1]) {
                    if (i + 1 == nums1.length - 1) {
                        return nums2[j + 1];
                    }
                    return Math.min(nums1[i + 2], nums2[j + 1]);
                } else {
                    if (j + 1 == nums2.length - 1) {
                        return nums1[i + 1];
                    }
                    return Math.min(nums1[i + 1], nums2[j + 2]);
                }
            }
        }
    }

    public static void main(String[] args) {
        P4_2 p4_2 = new P4_2();
        System.out.println(p4_2.findMedianSortedArrays(new int[]{3, 4}, new int[]{}));
    }
}
