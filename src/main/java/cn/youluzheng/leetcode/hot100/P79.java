package cn.youluzheng.leetcode.hot100;

public class P79 {
    boolean exist(char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }
        if (board[i][j - 1] == word.charAt(k)) {
            board[i][j - 1] = ' ';
            if (exist(board, word, i, j - 1, k + 1)) {
                return true;
            }
            board[i][j - 1] = word.charAt(k);
        }
        if (board[i + 1][j] == word.charAt(k)) {
            board[i + 1][j] = ' ';
            if (exist(board, word, i + 1, j, k + 1)) {
                return true;
            }
            board[i + 1][j] = word.charAt(k);
        }
        if (board[i][j + 1] == word.charAt(k)) {
            board[i][j + 1] = ' ';
            if (exist(board, word, i, j + 1, k + 1)) {
                return true;
            }
            board[i][j + 1] = word.charAt(k);
        }
        if (board[i - 1][j] == word.charAt(k)) {
            board[i - 1][j] = ' ';
            if (exist(board, word, i - 1, j, k + 1)) {
                return true;
            }
            board[i - 1][j] = word.charAt(k);
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        char[][] nb = new char[board.length + 2][board[0].length + 2];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, nb[i + 1], 1, board[0].length);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    nb[i + 1][j + 1] = ' ';
                    boolean result = exist(nb, word, i + 1, j + 1, 1);
                    if (result) {
                        return true;
                    }
                    nb[i + 1][j + 1] = word.charAt(0);
                }
            }
        }
        return false;
    }
}
