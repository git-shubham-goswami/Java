package Questions;
import java.util.*;

public class bubblesort {
	
	public static void bubbleSort(int[] arr) {
		
	
		for(int i=0; i<arr.length-1; i++) {
			boolean swapped = false;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
				
		} 
	}
	
	public static void recursion(int[] arr, int n) {
		if(n<=1) {
			return;
		}
		
		boolean swapped = false;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				swap(arr,i,i+1);
				swapped = true;
			}
		}
		if(!swapped) {
			return;
		}
		recursion(arr,n-1);
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,8,2,5,3,7};
		
		recursion(arr,arr.length);
	    System.out.println(Arrays.toString(arr));	
	}

}
