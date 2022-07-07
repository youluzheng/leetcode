package cn.youluzheng.leetcode.topcode;

public class P165 {

    int compare(String s1, String s2) {
        int value1 = Integer.parseInt(s1);
        int value2 = Integer.parseInt(s2);
        if (value1 > value2) return 1;
        if (value1 == value2) return 0;
        return -1;
    }

    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int i = 0;
        for (; i < Math.min(s1.length, s2.length); i++) {
            int ret = compare(s1[i], s2[i]);
            if (ret != 0) {
                return ret;
            }
        }
        if (s1.length > s2.length) {
            for (; i < s1.length; i++) {
                if (Integer.parseInt(s1[i]) > 0) {
                    return 1;
                }
            }
        } else {
            for (; i < s2.length; i++) {
                if (Integer.parseInt(s2[i]) > 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
