public class TicTacToe {
    public static boolean checkWinner(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol && board[1][j] == symbol && board[2][j] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X'},
                {'-', 'O', '-'},
                {'O', '-', '-'}
        };
        if (checkWinner(board, 'X')) {
            System.out.println("Player X wins!");
        } else if (checkWinner(board, 'O')) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}