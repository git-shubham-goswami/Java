package TCS;
//find duplicate in a a array
public class Question10 {
	
	private static void findDuplicate(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {20, 45, 34, 20, 34, 54, 3, 45, 0, 0};
		findDuplicate(arr);
	}

}
