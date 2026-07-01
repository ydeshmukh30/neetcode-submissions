class Solution {
    public boolean isValidSudoku(char[][] board) {
         boolean isValid = true;
                Map<Character, Integer> map = new HashMap<>();
                for (int i=0;i<9;i++) {
                    for (int j=0;j<9;j++) {
                        if (board[i][j] != '.' && map.containsKey(board[i][j])) {
                            isValid = false;
                        } else {
                            map.put(board[i][j], 1);
                        }
                    }
                    map.clear();
                }
                System.out.println(isValid);

                for (int i=0;i<9;i++) {
                    for (int j=0;j<9;j++) {
                        if (board[j][i] != '.' && map.containsKey(board[j][i])) {
                            isValid = false;
                        } else {
                            map.put(board[j][i], 1);
                        }
                    }
                    map.clear();
                }
                System.out.println(isValid);

                for (int i=0;i<9;i++) {
                    for (int j=0;j<9;j++) {
                        int row = 3 * (i / 3) + j / 3;
                        int col = 3 * (i % 3) + j % 3;
                        if (board[row][col] != '.' && map.containsKey(board[row][col])) {
                            isValid = false;
                        } else {
                            map.put(board[row][col], 1);
                        }
                    }
                    map.clear();
                }
                System.out.println(isValid);

                return isValid;
    }
}
