package recursion;

public class maxnum {
    static int max(int a, int b) {
        if (a > b) {
            return a; 
        } else {
            return b; 
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Maximum = " + max(num1, num2));
    }
}
