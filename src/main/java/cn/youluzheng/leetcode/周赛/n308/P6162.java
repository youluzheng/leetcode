package cn.youluzheng.leetcode.周赛.n308;

public class P6162 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count = 0;
        boolean[] isM = new boolean[garbage.length];
        boolean[] isG = new boolean[garbage.length];
        boolean[] isP = new boolean[garbage.length];
        for (int i = 0; i < garbage.length; i++) {
            String s = garbage[i];
            count += s.length();
            // MGP
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'M') {
                    isM[i] = true;
                } else if (s.charAt(j) == 'G') {
                    isG[i] = true;
                } else {
                    isP[i] = true;
                }
            }
            if (i != 0) {
                if (isM[i]) {
                    count += travel[i - 1];
                    for (int j = i - 1; j > 0; j--) {
                        if (!isM[j]) {
                            count += travel[j - 1];
                        } else {
                            break;
                        }
                    }
                }
                if (isG[i]) {
                    count += travel[i - 1];
                    for (int j = i - 1; j > 0; j--) {
                        if (!isG[j]) {
                            count += travel[j - 1];
                        } else {
                            break;
                        }
                    }
                }
                if (isP[i]) {
                    count += travel[i - 1];
                    for (int j = i - 1; j > 0; j--) {
                        if (!isP[j]) {
                            count += travel[j - 1];
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
