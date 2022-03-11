package cn.youluzheng.leetcode.贪心;

public class P860 {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for (int var : bills) {
            if (var == 5) {
                count5++;
            } else if (var == 10) {
                if (count5-- == 0) {
                    return false;
                }
                count10++;
            } else {
                if (count10 == 0) {
                    count5 -= 3;
                    if (count5 < 0) {
                        return false;
                    }
                } else {
                    count10--;
                    if (count5-- == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
