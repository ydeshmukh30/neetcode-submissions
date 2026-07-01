class Solution {
    public boolean isValidSudoku(char[][] board) {
                Map<Character, Integer> map = new HashMap<>();
                for (int i=0;i<9;i++) {
                    for (int j=0;j<9;j++) {
                        if (board[i][j] != '.' && map.containsKey(board[i][j])) {
                            return  false;
                        } else {
                            map.put(board[i][j], 1);
                        }
                    }
                    map.clear();
                }

                for (int i=0;i<9;i++) {
                    for (int j=0;j<9;j++) {
                        if (board[j][i] != '.' && map.containsKey(board[j][i])) {
                            return false;
                        } else {
                            map.put(board[j][i], 1);
                        }
                    }
                    map.clear();
                }

                for (int i=0;i<9;i++) {
                    for (int j=0;j<9;j++) {
                        int row = 3 * (i / 3) + j / 3;
                        int col = 3 * (i % 3) + j % 3;
                        if (board[row][col] != '.' && map.containsKey(board[row][col])) {
                            return false;
                        } else {
                            map.put(board[row][col], 1);
                        }
                    }
                    map.clear();
                }

                return true;
    }
}
