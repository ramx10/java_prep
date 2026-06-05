public class binarysearch {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 47, 9, 11 };
        int target = 47;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is present in the array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
}
