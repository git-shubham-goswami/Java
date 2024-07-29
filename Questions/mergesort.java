package Questions;

import java.util.Arrays;

public class mergesort {
	
	public static int[] mergeSort(int[] arr) {
		
		if(arr.length <= 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
		
	}
	
	public static int[] merge(int[] first, int[] second) {
		int[] mix = new int[first.length+second.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < first.length && j < second.length) {
			if(first[i] < second[j]) {
				mix[k] = first[i];
				i++;
			}else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}
		
		while(i<first.length) {
			mix[k] = first[i];
			k++;
			i++;
		}
		
		while(j<second.length) {
			mix[k] = second[j];
			k++;
			j++;
		}
		
		return mix;
	}
	
	
	//implace merge sort
	
	static void implace(int[] arr, int s, int e) {
		if(e-s <= 1) {
			return;
		}
		
		int mid = s+(e-s)/2;
		implace(arr,s,mid);
		implace(arr,mid,e);
		
		mergeInPlace(arr,s,mid,e);
		
	}
	
	static void mergeInPlace(int[] arr, int s, int m, int e) {
		int[] mix = new int[e-s];
		
		int i = s;
		int j = m;
		int k = 0;
		
		while(i < m && j < e) {
			if(arr[i] <= arr[j]) {
				mix[k] = arr[i];
				i++;
			}else {
				mix[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i<m) {
			mix[k] = arr[i];
			i++;
			j++;
		}
		
		
		while(j<e) {
			mix[k] = arr[j];
			j++;
			k++;
		}
		
		for(int l=0; l<mix.length; l++) {
			arr[s+l] = mix[l];
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {10,3,6,23,86,22};
		implace(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
