public class SelectionSort {

    // Function to perform Selection Sort
    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with arr[i]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Function to print array
    static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 9, 47, 9, 11};

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}