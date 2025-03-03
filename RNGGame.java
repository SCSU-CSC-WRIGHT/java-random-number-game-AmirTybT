import java.util.Random;
import java.util.Scanner;

public class RNGGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Pick a difficulty level: ");
        System.out.println("1. Easy (15 attempts)");
        System.out.println("2. Medium (10 attempts)");
        System.out.println("3. Hard (5 attempts)");
        int difficulty = scanner.nextInt();
        System.out.println("You have selected difficulty level " + difficulty);
        System.out.println("Are you sure you want to continue? (Y/N)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("N")) {
            System.out.println("Scared huh? Press play again to choose a new difficulty.");
            System.exit(0);
        }
        System.out.println("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        int attempts = 1;

        while (guess != number) {
        
            if (guess > number) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
        
            guess = scanner.nextInt();
            attempts++;
        }

        if (guess == number) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else if (attempts == 15 || attempts == 10 || attempts == 5) {
            System.out.println("You have reached the maximum number of attempts.");
        }

        scanner.close();
    }
}
