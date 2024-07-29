package TCS;

public class Question5 {
	
	
	private static int[] endZero(int[] arr) {
		
		int n = arr.length;
		int j = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] != 0 ) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {4,5,0,1,9,0,5,0};
		int result[] = endZero(arr);
		for(int val : result) {
			System.out.print(val+ " ");
		}
		
	}

}
