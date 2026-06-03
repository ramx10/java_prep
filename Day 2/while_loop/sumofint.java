package while_loop;

public class sumofint {
    public static void main(String[] args) {
        
        int input = 67873;
        int sum = 0;

        while (input != 0) {
            int digit = input % 10;
            sum += digit;
            input = input / 10;  
        }
        System.out.println("Sum of digits: " + sum);

    }
}
