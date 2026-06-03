package loops;

public class hallowsquare {
    public static void main(String[] args) {

        int line = 4;

        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= line; col++) {

                if (row == 1 || row == line || col == 1 || col == line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}