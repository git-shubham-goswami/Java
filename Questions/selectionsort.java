package Questions;

import java.util.Arrays;

public class selectionsort {
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			
			int last = arr.length-1-i;
			int maxidx = getMax(arr,0,last);
			
		    swap(arr, last, maxidx);
		}
	}
	
	public static void recursion(int[] arr, int start) {
        if (start < arr.length - 1) {
            int maxidx = getMax(arr, start, arr.length - 1);
            swap(arr, start, maxidx);
            recursion(arr, start + 1);
        }
    }
	
	public static int getMax(int[] arr, int start, int last) {
		int max = start;
		for(int i=start; i<=last; i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,8,5,7,2,4,1};
		recursion(arr,0);
		System.out.println(Arrays.toString(arr));
	}

}
