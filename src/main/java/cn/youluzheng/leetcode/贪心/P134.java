package cn.youluzheng.leetcode.贪心;

public class P134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int remain = 0;
        for (int i = 0; i < gas.length * 2; i++) {
            int realI = i % gas.length;
            if (i >= gas.length && realI == index) {
                return index;
            }
            if (remain + gas[realI] >= cost[realI]) {
                remain += gas[realI] - cost[realI];
            } else if (gas[realI] >= cost[realI]) {
                if (i >= gas.length - 1) {
                    return -1;
                }
                index = realI;
                remain = gas[realI] - cost[realI];
            } else {
                if (i >= gas.length - 1) {
                    return -1;
                }
                index = realI + 1;
                remain = 0;
            }
        }
        return -1;
    }
}
