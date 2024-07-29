package TCS;

public class Question1 {
	
	  private static boolean isPrime(int n) {
			if(n<=1){
				return false;
			}
			for(int i=2; i<= Math.sqrt(n); i++) {
				if(n%i == 0) {
					return false;
				}
			}
			return true;
	}
	  
	  private static boolean isSquare(int n) {
		  int sqt = (int)Math.sqrt(n);
		  return sqt * sqt == n;
	  }
	  
	  
	
	public static void series(int n) {
		int[] arr = new int[n];
		int poTwo = 1;
		int poThree = 1;
		for(int i=0; i<n; i++) {
			if(isPrime(i+1)) {
				arr[i] = poTwo;
				poTwo = poTwo * 2;
			}else if(isSquare(i+1)) {
				arr[i] = poThree;
				poThree = poThree * 3;
			}else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.println(arr[n-1]);
		
	}
	
	 
		public static void main(String[] args) {
			series(8);
	    	
	    	
		}

}
