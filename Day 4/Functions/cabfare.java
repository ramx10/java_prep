package Functions;

import java.util.Scanner;

public class cabfare {

    public static int taxiFare(int choice, int km, int hours) {

        if (choice == 1) {
            return km * 10;      
        }
        else if (choice == 2) {
            return km * 25;      
        }
        else if (choice == 3) {  

            if (hours == 1) {
                return km * 25;
            }
            else if (hours == 2) {
                return km * 30;
            }
            else {
                return km * 40;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Rental");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter distance (km): ");
        int km = sc.nextInt();

        int hours = 0;

        if (choice == 3) {
            System.out.print("Enter hours: ");
            hours = sc.nextInt();
        }

        int fare = taxiFare(choice, km, hours);

        System.out.println("Total Fare = " + fare);

        sc.close();
    }
}