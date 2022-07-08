package cn.youluzheng.leetcode.topcode;

public class P32 {
    // 查看hot100中的解法
    public int longestValidParentheses(String s) {
        if (s.length() <= 1) {
            return 0;
        }
        int max = 0;
        int[] help = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i - 2 >= 0) {
                        help[i] = help[i - 2] + 2;
                    } else {
                        help[i] = 2;
                    }
                } else {
                    if (i - help[i - 1] - 1 >= 0 && s.charAt(i - help[i - 1] - 1) == '(') {
                        if (i - help[i - 1] - 2 >= 0) {
                            help[i] = help[i - 1] + 2 + help[i - help[i - 1] - 2];
                        } else {
                            help[i] = help[i - 1] + 2;
                        }
                    }
                }
                max = Math.max(max, help[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        P32 p32 = new P32();
        System.out.println(p32.longestValidParentheses("()()()"));
        System.out.println(p32.longestValidParentheses("()(())"));
        System.out.println(p32.longestValidParentheses("())"));
    }
}
