 /* Ryan Barber Assignment 2.2
 Programming assignment
  */

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userChoice = scanner.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please run the program again and enter 1, 2, or 3.");
            scanner.close();
            return;
        }

        String computerMove = convertChoice(computerChoice);
        String userMove = convertChoice(userChoice);

        System.out.println("Computer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
                (userChoice == 1 && computerChoice == 3) || //rock beats scissors
                (userChoice == 2 && computerChoice == 1) || //paper beats rock
                (userChoice == 3 && computerChoice == 2) //scissors beats paper
            ) {
                System.out.println("Result: You win!");
        }
        else {
            System.out.println("Result: Computer wins!");
        }

        scanner.close();
    }

    public static String convertChoice(int choice) {
        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
}
/*End of line*/