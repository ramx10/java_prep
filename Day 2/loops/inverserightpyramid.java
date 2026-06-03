package loops;

public class inverserightpyramid {
    public static void main(String[] args) {

        int line = 4;

        for (int row = 1; row <= line; row++) {

            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }

            for (int star = row; star <= line; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}