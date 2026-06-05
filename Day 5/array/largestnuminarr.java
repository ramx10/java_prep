public class largestnuminarr {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 47, 9, 11 };
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    }
    
} 
    
