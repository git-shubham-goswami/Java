package TCS;

// find the second largest number in a  array
public class Question8 {
	
	private static int findSecondLargest(int[] arr) {
		
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				
			}else if(arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,35,1,10,34,1};
		int result = findSecondLargest(arr);
		System.out.println(result);
	}

}
