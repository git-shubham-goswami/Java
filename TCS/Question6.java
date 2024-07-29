package TCS;

import java.util.HashMap;

public class Question6 {
	
	
	private static int[] sort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	private static int[] replaceRank(int[] arr) {
		int[] result = arr.clone();
		sort(result);
		
		int[] finalarr = new int[arr.length];
		
		int rank = 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<result.length; i++) {
			if(!map.containsKey(result[i])) {
				map.put(result[i], rank);
				rank++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
				finalarr[i] = map.get(arr[i]);
		}
		
		
		return finalarr;
	
	}
	
	
	public static void main(String[] args) {
		int[] arr = {20,15,26,2,98,6};
		int[] result = replaceRank(arr);
		
		for(int val : result) {
			System.out.print(val+" ");
		}
	}

}
