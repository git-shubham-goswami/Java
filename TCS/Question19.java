package TCS;

import java.util.HashMap;

//given an integer array find subarrays with a given sum in it

public class Question19 {
	
	private static void printarr(int[] arr, int n, int m) {
		for(int i=n; i<m; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	private static void subarrays(int[] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum = sum + arr[j];
				if(sum == target) {
					printarr(arr, i, j+1);
					
				}
			}
			
		}
		
	}
	
		public static void main(String[] args) {
		int[] arr = {3,4,-7,1,3,3,1,-4};
		int target = 7;
		subarrays(arr, target);
		
		
	}

}
