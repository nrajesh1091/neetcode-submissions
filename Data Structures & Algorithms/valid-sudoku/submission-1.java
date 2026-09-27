class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Map<Character, Boolean> map = new HashMap();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (map.get(board[i][j]) != null) {
                        return false;
                    } else {
                        map.put(board[i][j], true);
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            Map<Character, Boolean> map = new HashMap();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (map.get(board[j][i]) != null) {
                        return false;
                    } else {
                        map.put(board[j][i], true);
                    }
                }
            }
        }

        for (int d = 0; d < 9; d++) {
            Map<Character, Boolean> map = new HashMap();
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    int row = (d / 3) * 3 + a;
                    int col = (d % 3) * 3 + b;
                    if (board[row][col] != '.') {
                        if (map.get(board[row][col]) != null) {
                            return false;
                        } else {
                            map.put(board[row][col], true);
                        }
                    }
                }
            }
        }
        return true;
    }
}
