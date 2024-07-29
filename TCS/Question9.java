package TCS;
//reverse a array in place
public class Question9 {
	
	private static int[] reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] result = reverse(arr);
		for(int val : result) {
			System.out.print(val + " ");
		}
	}

}
