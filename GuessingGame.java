import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int roundsWon = 0;
        int roundsPlayed = 0;
        
        System.out.println("Welcome to the Guessing Game!");

        while (true) {
            int number = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean success = false;

            System.out.println("Guess a number between " + minRange + " and " + maxRange + ". You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number " + number + " in " + attempts + " attempts.");
                    success = true;
                    roundsWon++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!success) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + number + ".");
            }

            roundsPlayed++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing!");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Rounds won: " + roundsWon);
        
        scanner.close();
    }
}
