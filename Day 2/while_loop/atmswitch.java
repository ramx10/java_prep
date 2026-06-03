package while_loop;

import java.util.Scanner;

public class atmswitch {
    
    public static void main(String[] args) {
        System.out.println("1.check balance 2.withdraw 3.deposit 4.simple interest 5.exit");

        Scanner sc = new Scanner(System.in);

        int option =  0 ;  
        int balance = 10000;

        while (option != 5) {
            System.out.println("Enter your option: ");
            option = sc.nextInt();
            switch (option) {
            case 1:
                System.out.println("Your available balance is :" + balance);
                break;

            case 2:
                System.out.println("Enter amount to be withdraw");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 3:
                System.out.println("Enter amount to deposit: ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Deposit Successful");
                System.out.println("Updated Balance: " + balance);
                break;

            case 4:
                System.out.println("Enter Principle amount: ");
                double principle = sc.nextDouble();

                System.out.println("Enter Rate of interest: ");
                double rate = sc.nextDouble();

                System.out.println("Enter Number of Years: ");
                double year = sc.nextDouble();

                double simpleInterest = (principle * rate * year)/ 100;

                System.out.println("Simple Interest = " + simpleInterest);
                System.out.println("Total Amount = " + (principle + simpleInterest));
                break;
            
            case 5:
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid option");

        }
            
        }

        sc.close();
    }
}
