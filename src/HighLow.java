import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while (!win) {
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }

            if (numberOfTries == 10 && !win) {
                System.out.println("You lose! The number was " + numberToGuess);
                break;
            }
        }

        if (win) {
            System.out.println("Good guess! You won in " + numberOfTries + " tries.");
        }
    }
}


