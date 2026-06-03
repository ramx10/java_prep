import java.util.Scanner;

public class electricbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        int billAmount;

        if (units <= 100) {
            billAmount = units * 1;
        } else if (units <= 200) {
            billAmount = 100 * 1+ (units - 100) * 2;
        } else if (units <= 300) {
            billAmount = 100 * 1 + 100 * 2 + (units - 200) * 3;
        } else {
            billAmount = 100 * 1 + 100 * 2 + 100 * 3 + (units - 300) * 5;
        }

        System.out.println("Total bill amount: " + billAmount);
        sc.close();
    }
    
}
