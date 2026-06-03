import java.util.Scanner;

public class swaping {

    public static void main(String[] agrs) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("before swaping " + num1 + " " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("after swaping " + num1 + " " + num2);
        
    }
}
