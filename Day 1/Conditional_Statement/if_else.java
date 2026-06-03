import java.util.Scanner;public class if_else {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
        sc.close();
    }
    
}
