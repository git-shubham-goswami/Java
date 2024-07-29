package dsa.Hash;
import java.util.*;
public class UnionOf2Arr {
	public static void main(String args[]) {   //O(n)
		int arr1[] = {7,3,9};
		int arr2[] = {7,3,6,9,2,4,9};
		HashSet<Integer> set = new HashSet<>();
		
		//adding all elements of arr1
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		//adding all elements of arr2
		for(int j=0; j<arr2.length; j++) {
			set.add(arr2[j]);
		}
		
		
		System.out.println("Union is "+ set);

    }
}