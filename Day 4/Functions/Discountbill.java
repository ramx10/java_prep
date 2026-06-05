package Functions;

import java.util.Scanner;

public class Discountbill {

    public static double discount(double bill) {

        if (bill > 5000) {
            return bill - (bill * 0.25);
        } 
        else if (bill > 2000) {
            return bill - (bill * 0.20);
        } 
        else if (bill > 1000) {
            return bill - (bill * 0.10);
        } 
        else {
            return bill;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double finalBill = discount(bill);

        System.out.println("Original Bill: " + bill);
        System.out.println("Final Bill after discount: " + finalBill);

        sc.close();
    }
}