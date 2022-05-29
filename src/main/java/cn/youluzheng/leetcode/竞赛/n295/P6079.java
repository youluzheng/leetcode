package cn.youluzheng.leetcode.竞赛.n295;

public class P6079 {
    private boolean isPrices(String s) {
        if (s.charAt(0) != '$' || s.length() == 1) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    private String replace(String s, int discount) {
        long value = Long.parseLong(s.substring(1));
        double newValue = (1 - 1.0 * discount / 100) * value;
        return String.format("$%.2f", newValue);
    }

    public String discountPrices(String sentence, int discount) {
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(isPrices(s) ? replace(s, discount) : s);
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        double a = 50.0 / 100;
        System.out.printf("%.2f%n", a);
    }
}
