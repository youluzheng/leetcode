package cn.youluzheng.leetcode.周赛.n304;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P6134 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = node1;
        int count = 0;
        while (temp != -1 && !map.containsKey(temp)) {
            map.put(temp, count);
            temp = edges[temp];
            count++;
        }
        Set<Integer> set2 = new HashSet<>();
        temp = node2;
        count = 0;
        int min = Integer.MAX_VALUE;
        int node = Integer.MAX_VALUE;
        while (temp != -1 && !set2.contains(temp)) {
            if (map.containsKey(temp)) {
                if (Math.max(map.get(temp), count) < min) {
                    min = map.get(temp) + count;
                    node = temp;
                } else if (Math.max(map.get(temp), count) == min) {
                    node = Math.min(node, temp);
                }
            }
            set2.add(temp);
            temp = edges[temp];
            count++;
        }
        return node == Integer.MAX_VALUE ? -1 : node;
    }
}
