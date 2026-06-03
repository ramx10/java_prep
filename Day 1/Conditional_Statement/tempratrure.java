import java.util.Scanner;

public class tempratrure {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter C or F: ");
        char choice = input.next().charAt(0);

        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();

        if (choice == 'C') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println(temp + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        }

        else if (choice == 'F') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println(temp + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        }

        else {
            System.out.println("Invalid choice! Please enter C or F.");
        }

        input.close();
    }
}