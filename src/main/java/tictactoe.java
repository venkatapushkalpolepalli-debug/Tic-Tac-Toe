public class TicTacToe {
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkDraw(char[][] board) {
        return isBoardFull(board);
    }
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };
        if (checkDraw(board)) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Moves still available.");
        }
    }
}