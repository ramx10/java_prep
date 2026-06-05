public class minvalueinarr {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 47, 9, 11 };
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Minimum value in the array is: " + minValue);
    }
}
