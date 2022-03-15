package cn.youluzheng.leetcode.动态规划;

import java.util.HashMap;
import java.util.Map;

public class P509 {

    Map<Integer, Integer> map = new HashMap<>() {{
        put(0, 0);
        put(1, 1);
    }};

    public int fib(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int x, y;
        if (map.containsKey(n - 1)) {
            x = map.get(n - 1);
        } else {
            x = fib(n - 1);
            map.put(n - 1, x);
        }
        if (map.containsKey(n - 2)) {
            y = map.get(n - 2);
        } else {
            y = fib(n - 2);
            map.put(n - 2, y);
        }
        return x + y;
    }

    public int fib2(int n) {
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
