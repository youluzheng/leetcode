package cn.youluzheng.leetcode.topcode;

public class P415 {
    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()) {
            num2 = "0".repeat(num1.length() - num2.length()) + num2;
        } else if (num1.length() < num2.length()) {
            num1 = "0".repeat(num2.length() - num1.length()) + num1;
        }
        StringBuilder sb = new StringBuilder();
        int ac = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            int b = num2.charAt(i) - '0';
            int sum = a + b + ac;
            ac = sum / 10;
            sb.insert(0, sum % 10);
        }
        if (ac == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
