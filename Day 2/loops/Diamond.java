package loops;

public class Diamond {
    public static void main(String[] args) {

        int line = 5;

        for (int row = 1; row <= line; row++) {
            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = line - 1; row >= 1; row--) {
            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
