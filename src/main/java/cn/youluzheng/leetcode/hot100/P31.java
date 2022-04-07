package cn.youluzheng.leetcode.hot100;

import java.util.LinkedList;
import java.util.List;

public class P31 {
    public void nextPermutation(int[] nums) {
        List<Integer> list = new LinkedList<>();
        list.add(nums[nums.length - 1]);
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                list.add(nums[i]);
            } else {
                list.add(0, nums[i] - 1);
                for (int j = list.size() - 1, k = nums.length - 1; j > 0; j--, k--) {
                    if (nums[i] < list.get(j) && nums[i] >= list.get(j - 1)) {
                        int temp = nums[i];
                        nums[i] = list.get(j);
                        list.set(j, temp);
                    }
                    nums[k] = list.get(j);
                }
                return;
            }
        }
        i++;
        for (int j = 0; j < list.size(); j++, i++) {
            nums[i] = list.get(j);
        }
    }
}
