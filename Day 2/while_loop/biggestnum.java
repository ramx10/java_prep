package while_loop;

public class biggestnum {
    public static void main(String[] args) {
        
        int input = 67873;
        int max = 0;

        while (input != 0) {
            int digit = input % 10;
            if(digit > max) {
                max = digit;
            }
            input = input / 10;  
        }
        System.out.println("Biggest digit: " + max);

    }
}
