package recursion;

public class sumoftennum {

    private static int sumOfNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfNumbers(n);

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}