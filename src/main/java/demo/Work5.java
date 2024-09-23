package demo;
import java.util.Random;
import java.util.Scanner;
public class Work5 {


        public static void main(String[] args) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            Scanner scanner = new Scanner(System.in);
            int guess = 0;

            System.out.println("Guess a number between 1 and 100");

            while (guess != numberToGuess) {
                System.out.print("guess a number: ");
                guess = scanner.nextInt();

                if (guess < numberToGuess) {
                    System.out.println("Too low");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Correct You guessed the number.");
                }
            }

            scanner.close();
}
}
