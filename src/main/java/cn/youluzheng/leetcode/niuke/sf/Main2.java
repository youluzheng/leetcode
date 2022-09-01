package cn.youluzheng.leetcode.niuke.sf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    static int[] postOrder(int root, Map<Integer, int[]> map, int[] value) {
        if (root == 0) {
            return new int[]{0, 0};
        }
        int[] child = map.get(root);
        if (child == null) {
            int[] ret = new int[2];
            if (value[root] > 0) {
                ret[1] = -value[root];
            } else {
                ret[0] = -value[root];
            }
            return ret;
        }
        int[] left = postOrder(child[0], map, value);
        int[] right = postOrder(child[1], map, value);
        int[] ret = new int[2];
        ret[0] = Math.max(left[0], right[0]);
        ret[1] = Math.min(left[1], right[1]);
        value[root] += ret[0] + ret[1];
        if (value[root] > 0) {
            ret[1] -= value[root];
        } else {
            ret[0] -= value[root];
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] value = new int[n + 1];
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int temp = in.nextInt();
            if (map.containsKey(temp)) {
                map.get(temp)[1] = i + 2;
            } else {
                map.put(temp, new int[]{i + 2, 0});
            }
        }
        for (int i = 1; i <= n; i++) {
            value[i] = in.nextInt();
        }
        int[] ret = postOrder(1, map, value);
        System.out.println(ret[0] - ret[1]);
    }
}
