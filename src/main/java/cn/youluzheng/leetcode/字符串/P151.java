package cn.youluzheng.leetcode.字符串;

public class P151 {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right;
        while (true) {
            while (left < s.length() && s.charAt(left) == ' ') {
                left++;
            }
            if (left >= s.length()) {
                break;
            }
            right = left;
            while (right < s.length() && s.charAt(right) != ' ') {
                right++;
            }
            if (right > s.length()) {
                break;
            }
            if (sb.length() != 0) {
                sb.insert(0, ' ');
            }
            sb.insert(0, s, left, right);
            left = right;
        }
        return sb.toString();
    }
}
