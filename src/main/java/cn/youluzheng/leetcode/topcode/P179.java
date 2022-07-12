package cn.youluzheng.leetcode.topcode;

import java.util.PriorityQueue;

public class P179 {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>(nums.length, (str1, str2) -> {
            int i = 0;
            int j = 0;
            while (i < str1.length() || j < str2.length()) {
                if (i == str1.length()) {
                    i = 0;
                }
                if (j == str2.length()) {
                    j = 0;
                }
                if (str2.charAt(j) > str1.charAt(i)) {
                    return 1;
                }
                if (str2.charAt(j) < str1.charAt(i)) {
                    return -1;
                }
                i++;
                j++;
            }
            return 0;
        });
        for (int n : nums) {
            queue.offer(String.valueOf(n));
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}
