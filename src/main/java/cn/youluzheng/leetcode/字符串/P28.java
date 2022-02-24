package cn.youluzheng.leetcode.字符串;

public class P28 {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        int[] help = new int[needle.length()];
        for (int i = 1, j = 0; i < needle.length() - 1; ) {
            while (i < needle.length() - 1 && needle.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                help[i] = j;
            }
            if (j == 0) {
                i++;
            } else {
                j = help[j];
            }
        }
        for (int i = 0, j = 0; i < haystack.length(); ) {
            while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length();
            }
            if (j == 0) {
                i++;
            } else {
                j = help[j];
            }
        }
        return -1;
    }
}
