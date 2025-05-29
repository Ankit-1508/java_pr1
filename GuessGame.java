import java.util.*;
public class GuessGame {
    public static void main(String[] args) {
        // Create Scanner for user input and Random for generating random numbers
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 7; // Maximum attempts allowed per round
        int score = 0;       // Track number of rounds won
        boolean playAgain = true; // Flag to control if user wants to play another round
        System.out.println("Welcome to the Number Guessing Game!");
        // Outer loop for multiple rounds
        while (playAgain) {
            // Generate a random number between 1 and 100
            int target = rand.nextInt(100) + 1;
            int attemptsLeft = maxAttempts; // Attempts counter for current round
            boolean guessedCorrectly = false; // Track if the user guessed correctly
            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");
            // Inner loop for attempts within a round
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt(); // Read user guess
                // Check if guess is correct
                if (guess == target) {
                    System.out.println("Correct! You've guessed the number.");
                    guessedCorrectly = true;
                    score++; // Increment score for a win
                    break;
                } else if (guess < target) {
                    System.out.println("Too low!"); // Feedback for low guess
                } else {
                    System.out.println("Too high!"); // Feedback for high guess
                }

                // Decrease remaining attempts
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            // If the user didn't guess the number in allotted attempts
            if (!guessedCorrectly) {
                System.out.println(" You've run out of attempts. The number was: " + target);
            }
            // Ask if user wants to play another round
            System.out.print("\nDo you want to play again? (yes/no): ");
            sc.nextLine(); // Consume newline
            String choice = sc.nextLine().trim().toLowerCase(); // Read and sanitize input
            playAgain = choice.equals("yes"); // Update flag based on input
        }
        // Show final score after exiting loop
        System.out.println("\nThanks for playing! Your score: " + score);
    }
}
