package cn.youluzheng.leetcode.回溯;

import java.util.LinkedList;
import java.util.List;

public class P93 {

    void restore(String s, int k, List<String> temp, List<String> result) {
        if (k == 0) {
            if (s.equals("")) {
                StringBuilder sb = new StringBuilder(temp.get(0));
                for (int i = 1; i < temp.size(); i++) {
                    sb.append('.').append(temp.get(i));
                }
                result.add(sb.toString());
            }
            return;
        }
        for (int i = 1; i < Math.min(s.length() + 1, 4); i++) {
            if (i > 1 && s.charAt(0) == '0') {
                break;
            }
            String sub = s.substring(0, i);
            int val = Integer.parseInt(sub);
            if (val >= 0 && val <= 255) {
                temp.add(sub);
                restore(s.substring(i), k - 1, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        restore(s, 4, new LinkedList<>(), result);
        return result;
    }
}
