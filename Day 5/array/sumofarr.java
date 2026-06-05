public class sumofarr {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 47, 9, 11 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements in the array is: " + sum);
    }
}
