package Questions;
import java.util.*;
//Given a sorted array containing N integers, both positive and negative.
//Create another array containing the squares of all the elements in the input array and return in
//non-decreasing array.
public class Question1 {
	
	
	public static int[] solution(int arr[]) {
		int size = arr.length;
		int left = 0;
		int right = size-1;
		int i = size-1;
		int result[] = new int[size];
		
		while(left <= right) {
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				result[i] = arr[left] * arr[left];
				left++;
			}else {
				result[i] = arr[right] * arr[right];
				right--;
			}
			i--;
		}
		return result;
		
	}
	
	
	public static void main(String args[]) {
		int arr[] = {-7,-5,-2,0,1};
		int result[] = solution(arr);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+ " ");
		}
		
	}
	

}
