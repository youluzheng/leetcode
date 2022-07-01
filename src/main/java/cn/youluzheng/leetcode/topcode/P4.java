package cn.youluzheng.leetcode.topcode;

public class P4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int k = (sum + 1) / 2;
        boolean isEven = sum % 2 == 0;
        if (nums1.length == 0) {
            if (isEven) {
                return (nums2[k - 1] + nums2[k]) / 2.0;
            }
            return nums2[k - 1];
        }
        if (nums2.length == 0) {
            if (isEven) {
                return (nums1[k - 1] + nums1[k]) / 2.0;
            }
            return nums1[k - 1];
        }
        int i1 = -1, i2 = -1;
        while (k != 1) {
            int k2 = k / 2;
            int n1 = Math.min(i1 + k2, nums1.length - 1);
            int n2 = Math.min(i2 + k2, nums2.length - 1);
            if (nums1[n1] >= nums2[n2]) {
                i2 = n2;
                if (i2 == nums2.length - 1) {
                    int min = (sum + 1) / 2;
                    if (isEven) {
                        return (nums1[min - nums2.length - 1] + nums1[min - nums2.length]) / 2.0;
                    }
                    return nums1[min - nums2.length - 1];
                }
            } else {
                i1 = n1;
                if (i1 == nums1.length - 1) {
                    int min = (sum + 1) / 2;
                    if (isEven) {
                        return (nums2[min - nums1.length - 1] + nums2[min - nums1.length]) / 2.0;
                    }
                    return nums2[min - nums1.length - 1];
                }
            }
            k = k - k2;
        }
        if (isEven) {
            if (nums1[i1 + 1] >= nums2[i2 + 1]) {
                if (i2 + 1 == nums2.length - 1) {
                    return (nums1[i1 + 1] + nums2[i2 + 1]) / 2.0;
                }
                return (nums2[i2 + 1] + Math.min(nums1[i1 + 1], nums2[i2 + 2])) / 2.0;
            } else {
                if (i1 + 1 == nums1.length - 1) {
                    return (nums1[i1 + 1] + nums2[i2 + 1]) / 2.0;
                }
                return (nums1[i1 + 1] + Math.min(nums2[i2 + 1], nums1[i1 + 2])) / 2.0;
            }
        }
        return Math.min(nums1[i1 + 1], nums2[i2 + 1]);
    }
}
