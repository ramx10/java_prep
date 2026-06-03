package while_loop;

public class Length {
    public static void main(String[] args) {
        
        int input = 7427;
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;  
        }
        System.out.println("Number of digits: " + count);

    }
}