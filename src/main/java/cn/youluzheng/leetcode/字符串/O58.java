package cn.youluzheng.leetcode.字符串;

public class O58 {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
