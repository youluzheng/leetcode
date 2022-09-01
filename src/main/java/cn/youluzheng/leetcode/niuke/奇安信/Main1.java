package cn.youluzheng.leetcode.niuke.奇安信;

public class Main1 {

    int dfs(int[][] nodes, int i) {
        int count = 0;
        for (int j = 0; j < nodes[i].length; j++) {
            if (nodes[i][j] == 4) {
                count++;
                continue;
            }
            count += dfs(nodes, nodes[i][j]);
        }
        return count;
    }

//    public int DagPathNum(int[][] nodes) {
//        // write code here
//
//    }
}
