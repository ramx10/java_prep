import java.util.Scanner;

public class percent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = "";

        name = sc.nextLine();

        System.out.println("Enter your marks : ");

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;


       m1 = sc.nextInt();
       m2 = sc.nextInt();
       m3 = sc.nextInt();

        System.out.println("your marks " + m1 + m2 + m3);

    }
}