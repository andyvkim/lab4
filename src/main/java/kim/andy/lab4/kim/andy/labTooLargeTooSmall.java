package kim.andy.lab4.kim.andy;
import java.util.Scanner;

import java.util.Random;

/**
 * Created by andykim on 1/12/17.
 */
public class labTooLargeTooSmall {


        public void howManyGuesses() {
            Random rand = new Random();
            int secretNumber = rand.nextInt(10)+1;
            Scanner input = new Scanner(System.in);
            int guess;
            int nextGuess = 0;
            int counter = 1;

        System.out.println("Guess a number between 1 and 10");
            guess = input.nextInt();

        while (guess != secretNumber) {

            if (guess > secretNumber) {
                System.out.println("Too Big. Try again");
                counter++;

            } else if (guess < secretNumber) {
                System.out.println("Too Small. Try again");
                counter++;

            } else if (nextGuess == guess) {
                System.out.println("Guess again");
                counter += 0;
            }

            nextGuess = input.nextInt();

        }
        System.out.println("you got it");
        System.out.println(counter);

    }
    public static void main(String[] args) {

        labTooLargeTooSmall lab4TestRun = new labTooLargeTooSmall();
        lab4TestRun.howManyGuesses();
}

    }

