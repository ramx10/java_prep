package recursion;

public class Length {
    static int length(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + length(n / 10);
    }

    public static void main(String[] args) {
        int num = 4521;
        System.out.println("Length = " + length(num));
    }
}