package TCS;

import java.util.Stack;

//given an array of integer, find the nearest smaller number
//for every elament such that the smaller is on the left side

//input: {1,6,4,10,2,5}
//output: {-1,1,1,4,1,2}

public class Question3 {
	
	
	public static int[] nearestSmallest(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Stack<Integer> s = new Stack<>();	
		
		for(int i=0; i<n; i++) {
			while(!s.isEmpty() && s.peek() >= arr[i]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				result[i] = -1;
			}else {
				result[i] = s.peek();
			}
			
			s.push(arr[i]);
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,6,4,10,2,5};
		int result[] = nearestSmallest(arr);
		for(int val : result) {
			System.out.print(val + " ");
		}
		
	}

}
