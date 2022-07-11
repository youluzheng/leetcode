package cn.youluzheng.leetcode.topcode;

public class P14 {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (i == strs[0].length()) {
                return sb.toString();
            }
            char ch = strs[0].charAt(i);
            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != ch) {
                    return sb.toString();
                }
            }
            i++;
            sb.append(ch);
        }
    }
}
