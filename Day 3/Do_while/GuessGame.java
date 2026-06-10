package Do_while;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1, enter the secret number: ");
        int secret = sc.nextInt();

        int guess;

        do {
            System.out.print("Player 2, guess the number: ");
            guess = sc.nextInt();

            if(guess > secret) {
                System.out.println("Too High!");
            }
            else if(guess < secret) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct Guess!");
            }

        } while(guess != secret);

        System.out.println("Game Over");

        sc.close();
    }
}