package cn.youluzheng.leetcode.字符串;

public class P541 {
    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for (int left = 0; left < s.length(); left += 2 * k) {
            int right = Math.min(s.length(), left + k) - 1;
            while (right >= left) {
                result.append(s.charAt(right));
                right--;
            }
            if (left + k < s.length()) {
                result.append(s, left + k, Math.min(left + 2 * k, s.length()));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
