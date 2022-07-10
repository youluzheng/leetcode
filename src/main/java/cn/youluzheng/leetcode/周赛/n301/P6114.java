package cn.youluzheng.leetcode.周赛.n301;

public class P6114 {
    public boolean canChange(String start, String target) {
        int i = 0, j = 0;
        while (i < start.length() && j < start.length()) {
            while (j < target.length() && target.charAt(j) == '_') {
                j++;
            }
            while (i < start.length() && start.charAt(i) == '_') {
                i++;
            }
            if (i == start.length() && j == target.length()) {
                return true;
            }
            if (i == start.length() && j < i || j == target.length() && i < j) {
                return false;
            }
            // 符号不同
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }
            if (target.charAt(j) == 'L' && i < j) {
                return false;
            }
            if (target.charAt(j) == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        P6114 p6114 = new P6114();
        System.out.println(p6114.canChange("_L__R__R_", "L______RR"));
        System.out.println(p6114.canChange("R_L_", "__LR"));
        System.out.println(p6114.canChange("_R", "R_"));
        System.out.println(p6114.canChange("_R", "__"));
        System.out.println(p6114.canChange("__", "_R"));
        System.out.println(p6114.canChange("_LR_", "L__R"));
        System.out.println(p6114.canChange("__", "__"));
    }
}
