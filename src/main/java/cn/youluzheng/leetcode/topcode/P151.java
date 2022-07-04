package cn.youluzheng.leetcode.topcode;

public class P151 {
    String revert(String s, int i, int j) {
        StringBuilder sb = new StringBuilder();
        for (int k = j - 1; k >= i; k--) {
            sb.append(s.charAt(k));
        }
        return sb.toString();
    }

    public String reverseWords(String s) {
        s = revert(s, 0, s.length());
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (j < s.length() && s.charAt(j) == ' ') {
            j++;
        }

        while (true) {
            i = j;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            sb.append(revert(s, i, j));
            while (j < s.length() && s.charAt(j) == ' ') {
                j++;
            }
            if (j == s.length()) {
                break;
            }
            sb.append(' ');
        }
        return sb.toString();
    }
}
