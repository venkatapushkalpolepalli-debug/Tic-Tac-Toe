import java.util.Random;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private Random rand = new Random();

    public TicTacToe() {
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ');
    }

    public void updateBoard(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public void computerMove(char symbol) {
        int slot, row, col;

        while (true) {
            slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                updateBoard(row, col, symbol);
                break;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }
}