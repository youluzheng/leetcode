package cn.youluzheng.leetcode.动态规划;

import java.util.List;

public class P139 {

    boolean eq(String s, int startIndex, String target) {
        int i = startIndex;
        int j = 0;
        while (i < s.length() && j < target.length() && s.charAt(i) == target.charAt(j)) {
            i++;
            j++;
        }
        return j == target.length();
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;
        for (int j = 1; j <= s.length(); j++) {
            for (int i = 0; i < wordDict.size(); i++) {
                if (wordDict.get(i).length() <= j) {
                    if (dp[j - wordDict.get(i).length()] && eq(s, j - wordDict.get(i).length(), wordDict.get(i))) {
                        dp[j] = true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
