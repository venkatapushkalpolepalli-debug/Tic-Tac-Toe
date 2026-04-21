import java.util.Random;

class Toss {
    public static void main(String[] args) {
        Random random = new Random();

        int tossResult = random.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        if (tossResult == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        System.out.println("Toss Result: " + (tossResult == 0 ? player1 : player2) + " starts");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer);
    }
}