package cn.youluzheng.leetcode.周赛.n306;

public class P6150 {
    public static String smallestNumber(String pattern) {
        pattern = "I" + pattern;
        int[] ret = new int[pattern.length()];
        int n = pattern.length();
        for (int i = pattern.length() - 1; i >= 0; i--) {
            if (pattern.charAt(i) == 'I') {
                ret[i] = n;
                n--;
                for (int j = i + 1; j < pattern.length() && ret[j] == 0; j++) {
                    ret[j] = n;
                    n--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ret.length; i++) {
            sb.append(ret[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = P6150.smallestNumber("IDIDIDI");
        System.out.println(s);
    }
}
