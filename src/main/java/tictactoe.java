import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private Random rand = new Random();
    private Scanner sc = new Scanner(System.in);

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

    public void playerMove(char symbol) {
        int slot, row, col;
        while (true) {
            slot = sc.nextInt();
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
            if (isValidMove(row, col)) {
                updateBoard(row, col, symbol);
                break;
            }
        }
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

    public boolean checkWin(char s) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == s && board[i][1] == s && board[i][2] == s) return true;
            if (board[0][i] == s && board[1][i] == s && board[2][i] == s) return true;
        }
        if (board[0][0] == s && board[1][1] == s && board[2][2] == s) return true;
        if (board[0][2] == s && board[1][1] == s && board[2][0] == s) return true;
        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public void playGame() {
        char currentPlayer = 'X';

        while (true) {
            printBoard();

            if (currentPlayer == 'X') {
                playerMove('X');
            } else {
                computerMove('O');
            }

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println(currentPlayer + " wins!");
                break;
            }

            if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}