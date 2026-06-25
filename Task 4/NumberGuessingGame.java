import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too High! Try Again.");
            }
            else if (guess < randomNumber) {
                System.out.println("Too Low! Try Again.");
            }
            else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Total Attempts: " + attempts);
            }

        } while (guess != randomNumber);

        sc.close();
    }
}