import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.err.println("1,paratha 2.chai 3.sandwich 4.pizza 5.burger");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("you have ordered paratha");
                break;
            case 2:
                System.out.println("you have ordered chai");
                break;
            case 3:
                System.out.println("you have ordered sandwich");
                break;
            case 4:
                System.out.println("you have ordered pizza");
                break;
            case 5:
                System.out.println("you have ordered burger");
                break;
            default:
                System.out.println("invalid option");
        }
    }
}
