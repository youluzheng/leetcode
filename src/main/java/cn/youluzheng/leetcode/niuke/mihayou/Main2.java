package cn.youluzheng.leetcode.niuke.mihayou;

public class Main2 {
    public static int[] temperatures(int[] dailyTemperatures) {
        int[] ret = new int[dailyTemperatures.length];
        for (int i = dailyTemperatures.length - 2; i >= 0; i--) {
            if (dailyTemperatures[i] < dailyTemperatures[i + 1]) {
                ret[i] = 1;
            } else {
                int j = i + 1;
                while (dailyTemperatures[i] >= dailyTemperatures[j]) {
                    j = j + ret[j];
                    if (ret[j] == 0) {
                        break;
                    }
                }
                if (dailyTemperatures[j] > dailyTemperatures[i]) {
                    ret[i] = j - i;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] ret = temperatures(new int[]{1, 2, 3, 5, 1, 2, 3, 4, 2, 1});
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
        System.out.println();
        ret = temperatures(new int[]{3, 1, 4});
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
        System.out.println();
        ret = temperatures(new int[]{1, 2, 3});
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
    }
}
