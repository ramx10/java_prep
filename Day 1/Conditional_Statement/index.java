import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 500.0;
		System.out.print("Enter amount to debit: ");
		double debit = 0;
		if (sc.hasNextDouble()) {
			debit = sc.nextDouble();
		} else if (sc.hasNextInt()) {
			debit = sc.nextInt();
		} else {
			System.out.println("Invalid amount");
			sc.close();
			return;
		}

		if (debit <= 0) {
			System.out.println("Enter a positive amount");
		} else if (debit > balance) {
			System.out.println("Not sufficient funds");
		} else {
			balance -= debit;
			System.out.println("Debited amount: " + debit);
			System.out.println("Available balance: " + balance);
		}
		sc.close();
	}
}
