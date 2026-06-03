import java.util.Scanner;

public class intro {

    public static void main(String[] args) {
        System.out.println("please enter your name: ");

        Scanner Input = new Scanner(System.in);

        String name = "";
        name = Input.next();

        System.out.println("your name is " + name);

        System.out.println("please enter your age: ");
        int age = 0;
        age = Input.nextInt();
        System.out.println("your age is " + age);
    }
}