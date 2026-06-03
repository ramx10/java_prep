package while_loop;

public class armstrong {
    public static void main(String[] args) {
        
        int input = 153;
        int sum = 0;
        int temp = input;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp = temp / 10;  
        }

        if(sum == input) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
