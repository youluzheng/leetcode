package cn.youluzheng.leetcode.niuke.星环;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main1 {
    int[] fun2(int i, int[] nums) {
        // 找到最大的，i-1为最大值
        while (i < nums.length && nums[i] >= nums[i - 1]) {
            i++;
        }
        if (i == nums.length) {
            return new int[]{i, 0};
        }
        // 最大值
        int inner = nums[i - 1];
        int count = 1;
        // 所有递减的多可以一次去除
        while (i < nums.length && nums[i] < nums[i - 1]) {
            i++;
        }
        while (i < nums.length) {
            // 如果递增
            if (nums[i] >= nums[i - 1]) {
                // 如果比当前的值还大
                if (nums[i] >= inner) {
                    break;
                } else {
                    count++;
                }
            } else {
                int[] temp = fun2(i, nums);
                i = temp[0] - 1;
                count = Math.max(count, temp[1]);
            }
            i++;
        }
        return new int[]{i, count};
    }

    public int totalSteps(int[] nums) {
        int ret = 0;
        int i = 1;
        while (i != nums.length) {
            int[] temp = fun2(i, nums);
            i = temp[0];
            ret = Math.max(ret, temp[1]);
        }
        return ret;
    }

    public int totalSteps2(int[] nums) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.push(new int[]{nums[0], 0});
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num < deque.peek()[0]) {
                count = 1;
            } else {
                while (!deque.isEmpty() && num >= deque.peek()[0]) {
                    count = Math.max(count, deque.pop()[1]);
                }
                if (deque.isEmpty()) {
                    count = 0;
                } else {
                    count++;
                }
            }
            deque.push(new int[]{num, count});
            max = Math.max(count, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        int[] n2 = new int[]{1984, 106, 1571, 161, 1441, 1161, 1363, 1466, 426, 1373, 1687, 142, 870, 162, 1609, 627, 1606, 213, 957, 1405, 826, 1869, 1213, 1972, 72, 1367, 355, 831, 343, 951, 190, 1071, 60, 1651, 1703, 1705, 1093, 1737, 779, 1750, 1858, 236, 611, 777, 905, 654, 1521, 1207, 1566, 328, 1219, 215, 1285, 1421, 764, 768, 144, 1693};
        System.out.println(main1.totalSteps2(n2));
    }
}
