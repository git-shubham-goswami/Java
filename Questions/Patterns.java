package Questions;

public class Patterns {
	public static void main(String[] args) {
		pattern1(4);
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern7(4);
	}
    
	
	public static void pattern1(int n) {
		for(int row = 1; row <=n; row++) {
			for(int col = 1; col<= n+1-row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n) {
		for(int row = 1; row <=n; row++) {
			for(int col = 1; col<= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n) {
		for(int row = 1; row <=2*n-1; row++) {
			int c = row > n ? 2*n-row : row;
			for(int col = 1; col<= c; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int n) {
		for(int row = 1; row <=2*n-1; row++) {
			int c = row > n ? 2*n-row : row;
			int space = row<n ? n-row : row-n;
			
			for(int s = 1; s<=space; s++) {
				System.out.print(" ");
			}
			
			for(int col = 1; col<= c; col++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int n) {
		for(int row =1; row<= n; row++) {
	
			for(int space =1; space<=n-row; space++) {
				System.out.print(" " +" ");
			} 
			
			
			for(int col =row; col>=1; col--) {
				System.out.print(col + " ");
			}
			for(int col =2; col<=row; col++) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}
	
	
	public static void pattern6(int n) {
		for(int row =1; row<= 2*n-1; row++) {
			int s = row>n ? row-n : n-row; 
			
			for(int space = 1; space <=s; space++) {
				System.out.print(" "+" ");
			}
			int c = row < n ? row : 2*n-row;
			
			for(int col=c; col>=1; col--) {
				System.out.print(col+ " ");
			}
			
			for(int col =2; col<=c; col++) {
				System.out.print(col+ " ");
			}
			
			
			System.out.println();
		}
	}
		
		
		public static void pattern7(int n) {
			int ogn = n+1;
			int k = 2 *n;
			for(int row=1; row<=k-1; row++) {
				for(int col=1; col<=k-1; col++) {
					int value = ogn - Math.min(Math.min(row, col), Math.min(k-row, k-col));
					System.out.print(value +" ");
			
				}
				System.out.println();
			}
		}
	
	
}
