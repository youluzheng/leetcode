package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P43 {

    // xxx x0
    String multi(String num1, int num, int zeroLen) {
        if (num == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeroLen; i++) {
            sb.append("0");
        }
        int a = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int value = (num1.charAt(i) - '0') * num + a;
            a = value / 10;
            sb.append(value % 10);
        }
        if (a != 0) {
            sb.append(a);
        }
        return sb.toString();
    }

    String add(List<String> list, int maxLen) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for (int i = 0; i < maxLen; i++) {
            int temp = a;
            for (String str : list) {
                if (i >= str.length()) {
                    continue;
                }
                temp += str.charAt(i) - '0';
            }
            sb.append(temp % 10);
            a = temp / 10;
        }
        while (a != 0) {
            sb.append(a % 10);
            a = a / 10;
        }
        return sb.reverse().toString();
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String min;
        String max;
        if (num1.length() < num2.length()) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        int maxLen = 0;
        List<String> adds = new ArrayList<>();
        for (int i = 0; i < min.length(); i++) {
            if (min.charAt(i) - '0' == 0) {
                continue;
            }
            String ret = multi(max, min.charAt(i) - '0', min.length() - i - 1);
            maxLen = Math.max(maxLen, ret.length());
            adds.add(ret);
        }
        return add(adds, maxLen);
    }

    public static void main(String[] args) {
        P43 p43 = new P43();
//        System.out.println(p43.multi("9908", 2, 2));
//        System.out.println(p43.add(Arrays.asList("123", "12"), 3));
        System.out.println(p43.multiply("0", "0"));
        System.out.println(p43.multiply("2", "3"));
        System.out.println(p43.multiply("123", "456"));
    }
}
