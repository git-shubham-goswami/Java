package TCS;

public class Question7 {
	
	private static int[] find(int[][] arr, int target) {
		int row = arr.length;
		int col = arr[0].length;
		
		int[] result = new int[2];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int[][] arr = { {10,20,30,40},
		                {15,25,35,45},
		                {27,29,37,48},
		                {32,33,39,50} };
		
		int target = 29;
		
		int[] result = find(arr, target);
		for(int val : result) {
			System.out.print(val+ " ");
		}
	}

}
