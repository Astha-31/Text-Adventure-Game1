import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark forest. You see a path to your left and a cave to your right.");

        while (true) {
            System.out.print("What do you want to do? (left/right/quit): ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("left")) {
                System.out.println("You chose the path. You encounter a friendly squirrel and continue walking.");
                System.out.println("You reach a beautiful meadow. You see a house in the distance.");

                System.out.print("Do you want to enter the house? (yes/no): ");
                String houseChoice = scanner.nextLine().toLowerCase();

                if (houseChoice.equals("yes")) {
                    System.out.println("You enter the house and find a treasure chest. Congratulations, you win!");
                    break;
                } else {
                    System.out.println("You decide not to enter the house and continue exploring. The adventure continues...");
                }
            } else if (choice.equals("right")) {
                System.out.println("You chose the cave. It's dark and eerie inside. You hear strange sounds.");

                System.out.print("Do you want to enter the cave further? (yes/no): ");
                String caveChoice = scanner.nextLine().toLowerCase();

                if (caveChoice.equals("yes")) {
                    System.out.println("As you enter deeper into the cave, you encounter a dragon. Game over!");
                    break;
                } else {
                    System.out.println("You decide not to enter the cave and go back to the forest. The adventure continues...");
                }
            } else if (choice.equals("quit")) {
                System.out.println("Thanks for playing the Text Adventure Game. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'left', 'right', or 'quit'.");
            }
        }

        scanner.close();
    }
}
