package while_loop;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int a = sc.nextInt();
        int rev =  0;

        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;
        }

        if(rev == sc.nextInt()) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        System.out.println("Reversed number: " + rev);
    }
}
