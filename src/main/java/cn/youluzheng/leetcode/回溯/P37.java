package cn.youluzheng.leetcode.回溯;

import java.util.HashSet;
import java.util.Set;

public class P37 {

    boolean solve(int row, int col, char[][] board) {
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                set1.add(board[row][i]);
            }
        }
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                set2.add(board[i][col]);
            }
        }
        Set<Character> set3 = new HashSet<>();
        int rowId = row / 3;
        int colId = col / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[rowId * 3 + i][colId * 3 + j] != '.') {
                    set3.add(board[rowId * 3 + i][colId * 3 + j]);
                }
            }
        }
        for (char i = 1; i <= 9; i++) {
            char ch = (char) ('0' + i);
            if (!set1.contains(ch) && !set2.contains(ch) && !set3.contains(ch)) {
                board[row][col] = ch;
                boolean find = false;
                for (int j = col + 1; j < board.length; j++) {
                    if (board[row][j] == '.') {
                        find = true;
                        if (solve(row, j, board)) {
                            return true;
                        }
                        break;
                    }
                }
                if (!find) {
                    for (int k = row + 1; k < board.length; k++) {
                        for (int j = 0; j < board.length; j++) {
                            if (board[k][j] == '.') {
                                find = true;
                                if (solve(k, j, board)) {
                                    return true;
                                }
                                break;
                            }
                        }
                        if (find) {
                            break;
                        }
                    }
                }
                if (!find) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    solve(i, j, board);
                    break;
                }
            }
        }
    }
}
