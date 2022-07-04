package cn.youluzheng.leetcode.topcode;

import java.util.ArrayList;
import java.util.List;

public class P93 {
    void restore(int n, String s, String result, int index, List<String> ret) {
        if (n == 0) {
            if (index != s.length()) {
                return;
            }
            ret.add(result.substring(1));
        }
        int sum = 0;
        for (int i = index; i < s.length(); i++) {
            sum = sum * 10 + s.charAt(i) - '0';
            if (sum == 0) {
                restore(n - 1, s, result + "." + sum, i + 1, ret);
                break;
            }
            if (sum > 255) {
                break;
            }
            restore(n - 1, s, result + "." + sum, i + 1, ret);
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<>();

        restore(4, s, "", 0, ret);

        return ret;
    }

    public static void main(String[] args) {
        List<String> strings = new P93().restoreIpAddresses("25525511135");
        System.out.println(strings);
    }
}
