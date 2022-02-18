package cn.youluzheng.leetcode.哈希表;

public class P202 {
    public static boolean isHappy(int n) {
        int temp;
        while (true) {
            if (n < 10) {
                // 10以下的数中只有1和7是快乐数
                return n == 1 | n == 7;
            }
            temp = 0;
            while (n > 0) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = temp;
        }
    }
}
