package Questions;

import java.util.Arrays;

public class quicksort {

    public static void quickSort(int[] arr, int low, int hi) {
        if (low < hi) {
            int pivotIndex = partition(arr, low, hi);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, hi);
        }
    }

    static int partition(int[] arr, int low, int hi) {
        int mid = low + (hi - low) / 2; // Calculate the middle index
        int pivot = arr[mid]; // Use the middle element as the pivot
        int s = low;
        int e = hi;

        while (true) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s >= e) {
                return e; // Return the partition index
            }
            swap(arr, s, e);
            s++;
            e--;
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 45, 10, 43, 21, 1, 2 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
