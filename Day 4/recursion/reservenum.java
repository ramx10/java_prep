package recursion;

public class reservenum {
    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev; 
        }
        rev = rev * 10 + n % 10; 
        return reverse(n / 10, rev); 
    }

    public static void main(String[] args) {
        int num = 1234;
        int reversedNum = reverse(num, 0);
        System.out.println("Reversed number: " + reversedNum);
    }
}
