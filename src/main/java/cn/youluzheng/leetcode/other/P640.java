package cn.youluzheng.leetcode.other;

public class P640 {
    public static String solveEquation(String equation) {
        int[] xc = new int[2];
        int[] v = new int[2];
        String[] eq = equation.split("=");
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < eq[j].length(); ) {
                char op = '+';
                int tempNum = 0;
                if (eq[j].charAt(i) == '-' || eq[j].charAt(i) == '+') {
                    op = eq[j].charAt(i);
                    i++;
                }
                if (eq[j].charAt(i) != 'x') {
                    while (i < eq[j].length() && eq[j].charAt(i) >= '0' && eq[j].charAt(i) <= '9') {
                        tempNum = tempNum * 10 + eq[j].charAt(i) - '0';
                        i++;
                    }
                } else {
                    tempNum = 1;
                }
                if (i < eq[j].length() && eq[j].charAt(i) == 'x') {
                    if (op == '+') {
                        xc[j] += tempNum;
                    } else {
                        xc[j] -= tempNum;
                    }
                    i++;
                } else {
                    if (op == '+') {
                        v[j] += tempNum;
                    } else {
                        v[j] -= tempNum;
                    }
                }
            }
        }
        xc[0] -= xc[1];
        v[1] -= v[0];
        if (xc[0] == 0 && v[1] == 0) {
            return "Infinite solutions";
        } else if (xc[0] == 0) {
            return "No solution";
        } else {
            return String.format("x=%d", v[1] / xc[0]);
        }
    }

    public static void main(String[] args) {
        assert solveEquation("x=x").equals("Infinite solutions");
        assert solveEquation("x+1=x+2").equals("No solution");
    }
}
