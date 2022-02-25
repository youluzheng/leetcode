package cn.youluzheng.leetcode.字符串;

public class P459 {
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length() / 2 + 1; i++) {
            if (s.length() % i != 0) {
                continue;
            }
            int m = i;
            int n = 0;
            while (m < s.length() && s.charAt(m) == s.charAt(n)) {
                m++;
                n++;
            }
            if (m == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean repeatedSubstringPattern2(String s) {
        int[] help = new int[s.length() + 1];
        for (int i = 1, j = 0; i < s.length(); ) {
            while (i < s.length() && s.charAt(i) == s.charAt(j)) {
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
        return help[s.length()] != 0 && s.length() % (s.length() - help[s.length()]) == 0;
    }
}
