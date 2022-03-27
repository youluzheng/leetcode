package cn.youluzheng.leetcode.竞赛.n286;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P5268 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        for (int j : nums2) {
            if (set.contains(j)) {
                set.remove(j);
                set2.remove(j);
            }
        }
        result.add(new ArrayList<>(set));
        result.add(new ArrayList<>(set2));
        return result;
    }
}
