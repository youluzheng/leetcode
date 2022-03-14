package cn.youluzheng.leetcode.贪心;

public class P738 {

    void func(int value, StringBuilder sb) {
        if (value == 0) {
            sb.insert(0, '0');
            return;
        }
        char[] target = String.valueOf(value).toCharArray();
        for (int i = 0; i < target.length - 1; i++) {
            if (target[i] > target[i + 1]) {
                value = Integer.parseInt(String.valueOf(target, 0, i + 1)) - 1;
                for (i++; i < target.length; i++) {
                    sb.append("9");
                }
                func(value, sb);
                return;
            }
        }
        sb.insert(0, target);
    }

    public int monotoneIncreasingDigits(int n) {
        StringBuilder sb = new StringBuilder();
        func(n, sb);
        return Integer.parseInt(sb.toString());
    }
}
