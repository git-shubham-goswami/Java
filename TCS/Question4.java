package TCS;

public class Question4 {
	
	private static int equilibrium(int[] arr) {
        int n = arr.length;
		int[] leftSum = new int[n];
		int[] rightSum = new int[n];
		
		int left = 0;
		for(int i=0; i<n; i++) {
		   leftSum[i] = left;
		   left = left + arr[i];
		}
		
		int right = 0;
		for(int j = n-1; j>=0; j--) {
		    rightSum[j] = right;
		    right = right + arr[j];
		}
		
		for(int k=0; k<n; k++) {
			if(rightSum[k] == leftSum[k]) {
				return k;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {-7,1,5,2,-4,3,0};
		int result = equilibrium(arr);
		System.out.println(result);
		
		
	}

	

}
