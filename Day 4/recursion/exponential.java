package recursion;

public class exponential {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    private static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; 
        }
        return base * power(base, exponent - 1); 
    }


}
