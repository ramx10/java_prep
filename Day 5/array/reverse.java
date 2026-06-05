public class reverse {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 47, 9, 11 };
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    
} 