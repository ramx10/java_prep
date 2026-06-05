public class SortedString {
    public static void main(String[] args) {
        String str = "abcde";
        boolean sorted = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}