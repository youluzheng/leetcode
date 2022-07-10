package cn.youluzheng.leetcode.周赛.n286;

public class P5253 {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] answer = new long[queries.length];
        int base = (int) Math.pow(10, (intLength - 1) / 2);
        int max = (int) Math.pow(10, (intLength + 1) / 2) - 1;
        for (int i = 0; i < queries.length; i++) {
            if (base + queries[i] - 1 > max) {
                answer[i] = -1;
            } else {
                int result = base + queries[i] - 1;
                StringBuilder sb = new StringBuilder(String.valueOf(result));
                sb.append(new StringBuilder(sb).reverse());
                if (sb.length() > intLength) {
                    sb.deleteCharAt(sb.length() / 2);
                }
                answer[i] = Long.parseLong(sb.toString());
            }
        }
        return answer;
    }
}
