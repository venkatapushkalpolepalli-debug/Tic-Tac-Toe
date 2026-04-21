import java.util.Scanner;

class InputHandler {

    public static int getSlot() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            if (sc.hasNextInt()) {
                slot = sc.nextInt();
                if (slot >= 1 && slot <= 9) {
                    return slot;
                }
            } else {
                sc.next();
            }
            System.out.println("Invalid input. Try again.");
        }
    }

    public static void main(String[] args) {
        int chosenSlot = getSlot();
        System.out.println("You selected: " + chosenSlot);
    }
}