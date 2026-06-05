package recursion;

import java.util.Scanner;

public class factorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 1) {
            System.out.println("Enter an integer greater than 1.");
        } else {
            System.out.print("Prime factors of " + number + ": ");
            factorize(number, 2);
            System.out.println();
        }
    }

    private static void factorize(int number, int divisor) {
        if (number == 1) {
            return;
        }

        if (number % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(number / divisor, divisor);
        } else {
            factorize(number, divisor + 1);
        }
    }
}
