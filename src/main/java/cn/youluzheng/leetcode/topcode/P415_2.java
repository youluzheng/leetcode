package cn.youluzheng.leetcode.topcode;

public class P415_2 {
    public String addStrings(String num1, String num2) {
        int ac = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            ac += num1.charAt(i) - '0' + num2.charAt(j) - '0';
            sb.append(ac % 10);
            ac /= 10;
            i--;
            j--;
        }
        if (i == -1) {
            i = j;
            num1 = num2;
        }
        while (i >= 0) {
            ac += num1.charAt(i) - '0';
            sb.append(ac % 10);
            ac /= 10;
            i--;
        }
        if (ac == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        P415_2 p415_2 = new P415_2();
        System.out.println(p415_2.addStrings("0", "0"));
        System.out.println(p415_2.addStrings("10", "0"));
        System.out.println(p415_2.addStrings("99", "99"));
    }
}
