public class QuickSort{
    
    //divide and conqure approach 
    //find any pivt element from an array first ,last ,middle 
    //use i ,j pointers sort 
    //pivot element left less values and right side high values
    //partioning the array


    // Main function to sort an array using QuickSort
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    // Recursive helper function for QuickSort
    private void quickSort(int[] arr, int low, int high) {
        // Base case: If the sub-array has 0 or 1 element, it's already sorted
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);  // Sort left sub-array
            quickSort(arr, pi + 1, high); // Sort right sub-array
        }
    }

    // This function takes last element as pivot, places the pivot element at its correct position in sorted
    // array, and places all smaller (than pivot) to left of pivot and all greater elements to right of pivot
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = (low - 1);     // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Utility function to print array (for demonstration)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(arr);

        QuickSort qs = new QuickSort();
        qs.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        int[] arr2 = {2, 8, 7, 1, 3, 5, 6, 4};
        System.out.println("\nOriginal array 2:");
        printArray(arr2);
        qs.sort(arr2);
        System.out.println("Sorted array 2:");
        printArray(arr2);
    }
}


    