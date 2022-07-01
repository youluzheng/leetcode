package cn.youluzheng.leetcode.topcode;

public class P8 {
    public int myAtoi(String s) {
        int flag = 1;
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                break;
            }
        }
        if (i == s.length()) {
            return 0;
        }
        if (s.charAt(i) == '-') {
            flag = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        long value = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            value = value * 10 + s.charAt(i) - '0';
            i++;
            if (flag * value > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (flag * value < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) (flag * value);
    }
}
