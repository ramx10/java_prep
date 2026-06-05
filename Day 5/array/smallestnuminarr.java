public class smallestnuminarr {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 47, 9, 11 };
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element in the array is: " + smallest);
    }
}
