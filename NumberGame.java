import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 0;
        int totalScore = 0;
        boolean playitAgain = true;

        System.out.println("Welcome to the game in which you have to guess the number!");

        while (playitAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter the number your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have used all attempts. The number was: " + numberToGuess);
            }

            rounds++;
            if (guessedCorrectly) {
                totalScore += (maxAttempts - attempts + 1) * 10;
            }

            System.out.print("Do you want to play another round of the game? (yes/no): ");
            playitAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nOops! Game Over!");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Your Final Score: " + totalScore);

        scanner.close();
    }
}
