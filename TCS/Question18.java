package TCS;
// print fibonacci
public class Question18 {
	
	private static void fibonacci(int n) {
		
		int t1 = 0;
		int t2 = 1;
		int sum=0;
		
		for(int i=0; i<=n; i++) {
			System.out.print(t1+ " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		
	}
	
	public static void main(String[] args) {
		int n = 10;
		fibonacci(n);
	}

}
