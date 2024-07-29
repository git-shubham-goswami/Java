package dsa.Hash;
import java.util.*;
public class IntersectionOf2arr {
	
	public static void intersection(int arr1[], int arr2[]) {
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		//unique elements
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		//compare arr2 elements with set 
		for(int j=0; j<arr2.length; j++) {
			if(set.contains(arr2[j])) {
				count++;
				set.remove(arr2[j]);
			}
		}
		
		System.out.println(count);
		
	}
	public static void main(String args[]) {
		int arr1[] = {7,3,9,9,9};
		int arr2[] = {6,3,9,2,9,4};
		intersection(arr1,arr2);
	}

}
